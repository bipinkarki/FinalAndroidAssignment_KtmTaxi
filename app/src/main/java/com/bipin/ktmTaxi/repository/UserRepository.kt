package com.bipin.ktmTaxi.repository

import com.bipin.ktmTaxi.api.MyApi
import com.bipin.ktmTaxi.api.MyApiRequest
import com.bipin.ktmTaxi.api.ServiceBuilder
import com.bipin.ktmTaxi.entity.User
import com.bipin.ktmTaxi.response.ImageResponse
import com.bipin.ktmTaxi.response.LoginResponse
import okhttp3.MultipartBody

class UserRepository: MyApiRequest() {
    val myApi = ServiceBuilder.buildService(MyApi::class.java)

    suspend fun registerUser(user: User): LoginResponse{
        return apiRequest {
            myApi.registerUser(user)
        }
    }

    suspend fun checkUser(username : String, password: String): LoginResponse{
        return apiRequest {
            myApi.checkUser(username, password)
        }
    }

    suspend fun uploadImage(id: String, body: MultipartBody.Part)
            : ImageResponse {
        return apiRequest {
            myApi.uploadImage( id, body)
        }
    }
}