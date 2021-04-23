package com.bipin.ktmTaxi.response

import com.bipin.ktmTaxi.entity.Booking

data class BookingResponse (
    val success: Boolean? =null,
    val data : MutableList<Booking>? = null
    )