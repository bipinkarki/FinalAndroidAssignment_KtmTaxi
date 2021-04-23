package com.bipin.ktmTaxi.response

import com.bipin.ktmTaxi.entity.Booking

data class BookingUpdateResponse (
    val success: Boolean? =null,
    val data : Booking? = null
    )