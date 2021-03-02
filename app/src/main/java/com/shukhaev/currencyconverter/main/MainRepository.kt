package com.shukhaev.currencyconverter.main

import com.shukhaev.currencyconverter.network.CurrencyResponse
import com.shukhaev.currencyconverter.util.Resource
import dagger.Provides


interface MainRepository {
    suspend fun getRates(base: String): Resource<CurrencyResponse>

}