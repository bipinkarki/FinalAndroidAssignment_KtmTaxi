package com.bipin.ktmTaxi.repository

import com.bipin.ktmTaxi.api.DestinationApi
import com.bipin.ktmTaxi.api.MyApiRequest
import com.bipin.ktmTaxi.api.ServiceBuilder
import com.bipin.ktmTaxi.entity.Destination
import com.bipin.ktmTaxi.response.DestinationResponse
import com.bipin.ktmTaxi.response.ImageResponse
import okhttp3.MultipartBody

class DestinationRepository: MyApiRequest() {
    val DestinationApi = ServiceBuilder.buildService(DestinationApi::class.java)

    suspend fun insertDestination(destination: Destination): DestinationResponse {
        return apiRequest {
            DestinationApi.Insert_Destination(ServiceBuilder.token!!, destination)
        }
    }

    suspend fun getDestination(): DestinationResponse {
        return apiRequest {
            DestinationApi.getDestination(ServiceBuilder.token!!)

        }
    }

    suspend fun uploadImage(id: String, body: MultipartBody.Part)
            : ImageResponse {
        return apiRequest {
            DestinationApi.uploadImage(ServiceBuilder.token!!, id, body)
        }
    }

    suspend fun addToCart(destination: Destination):ImageResponse{
        return apiRequest {
            DestinationApi.book(ServiceBuilder.token!!,destination)
        }
    }
}


