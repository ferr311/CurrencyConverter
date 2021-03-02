package com.shukhaev.currencyconverter.util

sealed class Resource<T>(val data: T?, val msg: String?) {

    class Success<T>(data: T) : Resource<T>(data, null)
    class Error<T>(msg: String) : Resource<T>(null, msg)

}