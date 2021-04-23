package com.bipin.ktmtaxiwear.response

import com.bipin.ktmtaxiwear.entity.Booking


data class BookingResponse (
    val success: Boolean? =null,
    val data : MutableList<Booking>? = null
    )