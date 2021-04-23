package com.bipin.ktmTaxi.response

import com.bipin.ktmTaxi.entity.Destination

data class DestinationResponse (
    val success : Boolean? = null,
    val data : MutableList<Destination>? = null
    )