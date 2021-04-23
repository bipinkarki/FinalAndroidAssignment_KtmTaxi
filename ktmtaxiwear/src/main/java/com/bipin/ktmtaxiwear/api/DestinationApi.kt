package com.bipin.ktmtaxiwear.api




import com.bipin.ktmtaxiwear.Entity.Destination
import com.bipin.ktmtaxiwear.response.DestinationResponse
import com.bipin.ktmtaxiwear.response.ImageResponse
import okhttp3.MultipartBody
import retrofit2.Response
import retrofit2.http.*

interface DestinationApi {
    @POST("destination/insert")
    suspend fun Insert_Destination(
        @Header("Authorization") token: String,
        @Body destination: Destination
    ):Response<DestinationResponse>

    @GET("destination/showall")
    suspend fun getDestination(
        @Header("Authorization") token: String
    ):Response<DestinationResponse>


    @Multipart
    @PUT("student/{id}/photo")
    suspend fun uploadImage(
        @Header("Authorization") token: String,
        @Path("id") id: String,
        @Part file: MultipartBody.Part
    ): Response<ImageResponse>

    @POST("/destination/book")
    suspend fun book(@Header("authorization")token:String,@Body destination: Destination):Response<ImageResponse>
}