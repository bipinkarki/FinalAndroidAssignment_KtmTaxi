package com.bipin.ktmTaxi.dao

import androidx.room.Query
import com.bipin.ktmTaxi.entity.Booking

interface BookingDAO {
    @Query("select* from booking")
    suspend fun  getBooking() : MutableList<Booking>
}