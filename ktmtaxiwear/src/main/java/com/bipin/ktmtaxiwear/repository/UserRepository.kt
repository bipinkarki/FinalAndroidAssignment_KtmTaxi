package com.bipin.ktmtaxiwear.repository






import com.bipin.ktmtaxiwear.api.MyApi
import com.bipin.ktmtaxiwear.api.MyApiRequest
import com.bipin.ktmtaxiwear.api.ServiceBuilder
import com.bipin.ktmtaxiwear.response.LoginResponse

class UserRepository: MyApiRequest(){
    val myApi = ServiceBuilder.buildService(MyApi::class.java)

//    suspend fun registerUser(user: User): LoginResponse {
//        return apiRequest {
//            myApi.registerUser(user)
//        }
//    }

    suspend fun checkUser(username : String, password: String): LoginResponse {
        return apiRequest {
            myApi.checkUser(username, password)
        }
    }
}