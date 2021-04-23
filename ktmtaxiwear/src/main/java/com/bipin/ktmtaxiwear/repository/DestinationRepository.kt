package com.bipin.ktmtaxiwear.repository





import com.bipin.ktmtaxiwear.Entity.Destination
import com.bipin.ktmtaxiwear.api.MyApiRequest
import com.bipin.ktmtaxiwear.api.ServiceBuilder
import com.bipin.ktmtaxiwear.response.DestinationResponse
import com.bipin.ktmtaxiwear.response.ImageResponse
import okhttp3.MultipartBody

class DestinationRepository: MyApiRequest() {
    val DestinationApi = ServiceBuilder.buildService(com.bipin.ktmtaxiwear.api.DestinationApi::class.java)

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

    suspend fun addToCart(destination: Destination): ImageResponse {
        return apiRequest {
            DestinationApi.book(ServiceBuilder.token!!,destination)
        }
    }
}


