package com.bipin.ktmtaxiwear.api


import com.bipin.ktmtaxiwear.Entity.User
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ServiceBuilder {
     val BASE_URL = "http://10.0.2.2:90/"
//    val BASE_URL = "http://172.25.0.57:90/"



//val BASE_URL = "http://localhost:90/"

    var token: String? = null
    var user: User? = null

    private val okHttp = OkHttpClient.Builder()

    private val retrofitBuilder =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttp.build())

    private val retrofit = retrofitBuilder.build()

    //Generic class
    fun <T> buildService (serviceType: Class<T>): T {
        return retrofit.create(serviceType)
    }
    fun loadImg():String
    {
        var arr = BASE_URL.split("/")
        return arr[0]+"/"+arr[2]+"/"
    }

}