package com.example.todo.dtos

import com.fasterxml.jackson.annotation.JsonInclude

class UserDto {
    var id: Long = 0

    lateinit var email:String

    lateinit var password : String

    var verified : Boolean = false

    var accessToken: String? = null

    var tokenType: String? = null
}