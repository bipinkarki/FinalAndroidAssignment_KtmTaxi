package com.bipin.ktmTaxi.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.bipin.ktmTaxi.entity.User

@Dao
interface UserDAO {
////    Insert User
   @Insert
   suspend fun RegisterUser(user: User)

   @Query( "select * from User where username= (:username) and password = (:password)")
   suspend fun checkUser(username: String, password: String): User
}
