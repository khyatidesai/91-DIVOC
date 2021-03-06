package com.hackertronix.model.india.latest


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@Entity
@JsonClass(generateAdapter = true)
data class Summary(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @Json(name = "total")
    val total: Int = 0,
    @Json(name = "confirmedCasesIndian")
    val confirmedCasesIndian: Int = 0,
    @Json(name = "confirmedCasesForeign")
    val confirmedCasesForeign: Int = 0,
    @Json(name = "discharged")
    val discharged: Int = 0,
    @Json(name = "deaths")
    val deaths: Int = 0
)