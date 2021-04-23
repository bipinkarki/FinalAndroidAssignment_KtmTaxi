package com.bipin.ktmtaxiwear.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.bipin.ktmtaxiwear.Entity.Destination


@Entity
data class Booking (
        @PrimaryKey
        val _id : String= "",
        val UserId: String? =null,
        val Destination: Destination? = null,
        var Person: Int? = 0,
        val Date : String? = null
        )