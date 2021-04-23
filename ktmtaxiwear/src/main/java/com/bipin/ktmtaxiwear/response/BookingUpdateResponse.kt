package com.bipin.ktmtaxiwear.response

import com.bipin.ktmtaxiwear.entity.Booking


data class BookingUpdateResponse (
    val success: Boolean? =null,
    val data : Booking? = null
    )