package com.example.todo.exceptions

class NotVerifiedAccountException: RuntimeException {
    val type: Any
    val field: String
    val status = 401

    constructor(message: String, type: Any, field: String): super(message){
        this.field = field
        this.type = type
    }
}