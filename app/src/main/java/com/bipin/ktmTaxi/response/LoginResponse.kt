package com.bipin.ktmTaxi.response

import com.bipin.ktmTaxi.entity.User

data class LoginResponse (
        val success : Boolean? = null,
        val token : String? = null,
        val data : User? = null
)