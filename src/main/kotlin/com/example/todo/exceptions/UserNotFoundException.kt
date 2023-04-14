package com.example.todo.exceptions

class UserNotFoundException: RuntimeException {
    val type: Any
    val field: String
    val status = 404

    constructor(message: String, type: Any, field: String): super(message){
        this.field = field
        this.type = type
    }
}