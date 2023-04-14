package com.example.todo.constant

public object Constant {
    val MAIN_URL = "http://localhost:8083"
    val TOKEN_TYPE = "Bearer"
    val EMAIL_NOT_VERIFIED = "Account has not been verified!"

    val EMAIL_RFC_5322_REGEX = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])"
    val INVALID_EMAIL = "Inserted email is not valid!"
    val INVALID_PASSWORD = "Invalid password!"
    val EMAIL_ALREADY_EXISTS_ERROR_MESSAGE = "User with such email already exists!"
    val USER_NOT_FOUND = "User not found!"
    val TOKEN_NOT_FOUND = "Token not found!"
    val USER_ALREADY_VERIFIED = "User have already been verified!"
    val TOKEN_ALREADY_USED = "Token has already been used!"
}
