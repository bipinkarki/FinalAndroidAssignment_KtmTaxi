package com.bipin.ktmTaxi.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.bipin.ktmTaxi.entity.Destination

@Dao
interface DestinationDAO {
    // Insert Destination
    @Insert
    suspend fun insertDestinations(destination : MutableList<Destination>)

    @Query("select* from destination")
    suspend fun getDestinations() : MutableList<Destination>

    @Query("DELETE from destination")
    suspend fun deletedestination()
}