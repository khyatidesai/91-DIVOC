package com.hackertronix.data.worker

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.hackertronix.data.local.Covid19StatsDatabase
import com.hackertronix.data.network.TimelinesApi
import com.hackertronix.model.countries.CountriesStats
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.plusAssign
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import org.koin.core.KoinComponent
import org.koin.core.inject

class LatestStatsWorker(
    context: Context,
    params: WorkerParameters
) : Worker(context, params), KoinComponent {

    private val disposables = CompositeDisposable()
    private val apiClient: TimelinesApi by inject()
    private val databaseClient: Covid19StatsDatabase by inject()

    override fun doWork(): Result {
        disposables += apiClient.getTimelinesForAllCountries()
            .map {
                deleteAndSaveLatestStats(it)
            }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onError = {
                    Log.d("LatestStats Worker", "Failed ${it.localizedMessage}")
                },

                onSuccess = {
                    Log.d("LatestStats Worker", "Saved data")
                }
            )

        return Result.success()
    }

    private fun deleteAndSaveLatestStats(latestStats: CountriesStats) {
        Log.d("LatestStats Worker", "Saving data")
        databaseClient.countriesStatsDao().deleteAll()
        databaseClient.countriesStatsDao().insertCountryStats(latestStats)
    }

    override fun onStopped() {
        disposables.clear()
        super.onStopped()
    }
}