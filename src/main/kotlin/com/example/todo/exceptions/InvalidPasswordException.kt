package com.example.todo.exceptions

class InvalidPasswordException: RuntimeException {
    val type: Any
    val field: String
    val status = 415

    constructor(message: String, type: Any, field: String): super(message){
        this.field = field
        this.type = type
    }
}