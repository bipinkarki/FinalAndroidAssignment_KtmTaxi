package com.bipin.ktmTaxi.repository

import com.bipin.ktmTaxi.api.BookingApi
import com.bipin.ktmTaxi.api.MyApiRequest
import com.bipin.ktmTaxi.api.ServiceBuilder
import com.bipin.ktmTaxi.response.BookingResponse
import com.bipin.ktmTaxi.response.BookingUpdateResponse

class BookingRepository: MyApiRequest() {
    val BookingApi = ServiceBuilder.buildService(BookingApi::class.java)

    suspend fun getBooking(): BookingResponse{
        return apiRequest {
            BookingApi.getBooking(ServiceBuilder.token!!)
        }
    }

    suspend fun deleteBooking(id: String): BookingResponse{
        return apiRequest {
            BookingApi.deleteBooking(ServiceBuilder.token!!, id)
        }
    }

    suspend fun updateBooking(id: String, Person: Int) : BookingUpdateResponse{
        return apiRequest {
            BookingApi.updateBooking(Person = Person, id = id, token = ServiceBuilder.token!!)
        }
    }
}