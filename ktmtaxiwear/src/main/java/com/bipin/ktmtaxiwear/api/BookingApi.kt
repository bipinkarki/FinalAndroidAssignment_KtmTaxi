package com.bipin.ktmtaxiwear.api






import com.bipin.ktmtaxiwear.response.BookingResponse
import com.bipin.ktmtaxiwear.response.BookingUpdateResponse
import retrofit2.http.*

interface BookingApi {
   @GET("/booking/showall")
   suspend fun getBooking(
           @Header ("Authorization") token: String
   ):retrofit2.Response<BookingResponse>

   @DELETE ("/Mytours/delete/{id}")
   suspend fun deleteBooking(
           @Header ("authorization") token: String,
           @Path("id") id:String
   ):retrofit2.Response<BookingResponse>

   @PUT ("/Mytours/update/{id}")
   suspend fun updateBooking(
       @Header ("authorization") token: String, @Path("id") id: String,
       @Field ("Person") Person: Int
   ):retrofit2.Response<BookingUpdateResponse>
}



