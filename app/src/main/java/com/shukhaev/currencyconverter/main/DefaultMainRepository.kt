package com.shukhaev.currencyconverter.main

import com.shukhaev.currencyconverter.network.CurrencyApi
import com.shukhaev.currencyconverter.network.CurrencyResponse
import com.shukhaev.currencyconverter.util.Resource
import java.lang.Exception
import javax.inject.Inject

class DefaultMainRepository @Inject constructor(private val api: CurrencyApi) : MainRepository {

    override suspend fun getRates(base: String): Resource<CurrencyResponse> {
        return try {
            val response = api.getRates(base)
            val result = response.body()
            if (response.isSuccessful && result != null){
                Resource.Success(result)
            }else{
                Resource.Error(response.message())
            }
        }catch (e:Exception){
            return Resource.Error(e.message ?: "Some error")
        }
    }
}