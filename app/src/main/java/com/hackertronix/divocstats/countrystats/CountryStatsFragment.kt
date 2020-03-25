package com.hackertronix.divocstats.countrystats

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import com.hackertronix.divocstats.R
import com.hackertronix.divocstats.common.UiState.Done
import com.hackertronix.divocstats.common.UiState.Loading
import com.hackertronix.divocstats.parseDate
import com.hackertronix.divocstats.toFlagEmoji
import com.hackertronix.model.india.latest.Latest
import kotlinx.android.synthetic.main.collapsing_card.updated_at
import kotlinx.android.synthetic.main.fragment_country_stats.appBar
import kotlinx.android.synthetic.main.fragment_country_stats.confirmed_textview
import kotlinx.android.synthetic.main.fragment_country_stats.content
import kotlinx.android.synthetic.main.fragment_country_stats.deaths_textview
import kotlinx.android.synthetic.main.fragment_country_stats.recovered_textview
import kotlinx.android.synthetic.main.fragment_country_stats.swipeContainer
import kotlinx.android.synthetic.main.shimmer_overview.shimmer_view
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.androidx.viewmodel.ext.android.viewModel

class CountryStatsFragment : Fragment() {

    val viewModel: CountryStatsViewModel by viewModel()

    private var countryCode: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            countryCode = it.getString(COUNTRY_CODE)
        }
    }

    private fun setupToolbar() {
        activity?.let {
            appBar.title = it.getString(R.string.country_stats, countryCode?.toFlagEmoji())
            (it as AppCompatActivity).setSupportActionBar(appBar)
            (it as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
            (it as AppCompatActivity).supportActionBar?.setDisplayShowHomeEnabled(true)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_country_stats, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupToolbar()

        subscribeToLatestStats()
        subscribeToRefreshState()

        attachListeners()
    }

    private fun attachListeners() {
        swipeContainer.setOnRefreshListener {
            viewModel.refreshLatestStats()
        }
    }

    private fun subscribeToRefreshState() {
        viewModel.getUiState().observe(viewLifecycleOwner, Observer { state ->
            when (state) {
                is Loading -> showLoading()
                is Error -> showContent()
                is Done -> showContent()
            }
        })
    }

    private fun showContent() {
        swipeContainer.isRefreshing = false
        content.visibility = View.VISIBLE
        shimmer_view.stopShimmer()
        shimmer_view.visibility = View.GONE
    }

    private fun showLoading() {
        swipeContainer.isRefreshing = true
        content.visibility = View.INVISIBLE
        shimmer_view.visibility = View.VISIBLE
        shimmer_view.startShimmer()
    }

    private fun subscribeToLatestStats() {
        viewModel.getLatestStats().observe(viewLifecycleOwner, Observer { overview ->
            confirmed_textview.text = String.format("%,d", totalConfirmed(overview))
            recovered_textview.text = String.format("%,d", overview.data.summary.discharged)
            deaths_textview.text = String.format("%,d", overview.data.summary.deaths)
            updated_at.text = setDate(overview.lastRefreshed.parseDate())
        })
    }

    private fun totalConfirmed(latestStat: Latest): Int {
        return latestStat.data.summary.confirmedCasesForeign + latestStat.data.summary.confirmedCasesIndian
    }

    private fun setDate(parsedDate: String): String {
        val splitString = parsedDate.split(",")
        return resources.getString(R.string.updated_at_header, splitString.first(), splitString.last())
    }

    companion object {
        private const val COUNTRY_CODE = "country_code"
        const val INDIA = "IN"

        @JvmStatic
        fun newInstance(countryCode: String) =
            CountryStatsFragment().apply {
                arguments = Bundle().apply {
                    putString(COUNTRY_CODE, countryCode)
                }
            }
    }






    fun amerDoubt(){




    }

}
