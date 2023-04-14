package com.example.todo.services

import com.example.todo.dtos.UserDto

interface UserServiceInterface {
    fun registerUser(dto : UserDto): UserDto
    fun sendMail(email : String) : Boolean
    fun confirmUserAccount(token : String) : UserDto
    fun login(dto : UserDto) : UserDto
    fun resetPassword(email : String) : String
    fun changePassword(token : String, dto : UserDto) : UserDto
    fun updateUserById(id : Long, dto : UserDto) : UserDto

}