package com.bipin.ktmtaxiwear.response


import com.bipin.ktmtaxiwear.Entity.Destination

data class DestinationResponse (
    val success : Boolean? = null,
    val data : MutableList<Destination>? = null
    )