package com.bipin.ktmTaxi

import com.bipin.ktmTaxi.api.ServiceBuilder
import com.bipin.ktmTaxi.entity.User
import com.bipin.ktmTaxi.repository.BookingRepository
import com.bipin.ktmTaxi.repository.UserRepository
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test

class UnitTesting {

    @Test
    fun registerUser() = runBlocking {
        val user = User(firstname = "samman", lastname = "bhattarai", address = "gynesor", email = "samman55@gmail.com", phone = "98432157", username = "samabhatt", password = "8899" )
        val userRepository = UserRepository()
        val response = userRepository.registerUser(user)
        val expectedResult = true
        val actualResult = response.success
        Assert.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun checkUser() = runBlocking {
        val userRepository = UserRepository()
        val response = userRepository.checkUser("elephantmasta", "coolbipin")
        ServiceBuilder.token = response.token
        val expectedResult = true
        val actualResult = response.success
        Assert.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun registerUserfailed() = runBlocking {
        val user =
                User(firstname = "ddff", lastname = "adffff", address = "dfggggg", email = "bk55@gmail.com",username =  "admin123", password = "admin")
        val userRepository = UserRepository()
        val response = userRepository.registerUser(user)
        val expectedResult = true
        val actualResult = response.success
        Assert.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun checkUserFailed() = runBlocking {
        val userRepository = UserRepository()
        val response = userRepository.checkUser("elephantmasta", "coolbipin")
        ServiceBuilder.token = response.token
        val expectedResult = true
        val actualResult = response.success
        Assert.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun GetBooking() = runBlocking {
        ServiceBuilder.token="Bearer "+UserRepository().checkUser("elephantmasta","coolbipin").token
        val booking = BookingRepository()
        val response = booking.getBooking()
        val expectedResult = true
        val actualResult = response.success
        Assert.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun GetBookingfailed() = runBlocking {
        ServiceBuilder.token="Bearer "+UserRepository().checkUser("elephantmasta","coolbipin").token
        val booking = BookingRepository()
        val response = booking.getBooking()
        val expectedResult = true
        val actualResult = response.success
        Assert.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun DeleteBooking() = runBlocking {
        ServiceBuilder.token="Bearer "+UserRepository().checkUser("elephantmasta","coolbipin").token
        val repository = BookingRepository()
        val response = repository.deleteBooking(id = "60823e074a7243187022890c")
        val expectedResult = true
        val actualResult = response.success
        Assert.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun DeleteBookingFailed() = runBlocking {
        ServiceBuilder.token="Bearer "+UserRepository().checkUser("abinkumar","12345").token
        val repository = BookingRepository()
        val response = repository.deleteBooking(id = "6082bbe0acf8a83b9c397815")
        val expectedResult = true
        val actualResult = response.success
        Assert.assertEquals(expectedResult, actualResult)
    }

}