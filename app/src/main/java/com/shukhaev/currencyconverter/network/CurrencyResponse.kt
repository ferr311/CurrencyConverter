package com.shukhaev.currencyconverter.network


import com.google.gson.annotations.SerializedName
import com.shukhaev.currencyconverter.data.Rates

data class CurrencyResponse(
    @SerializedName("base")
    val base: String,
    @SerializedName("date")
    val date: String,
    @SerializedName("rates")
    val rates: Rates
)