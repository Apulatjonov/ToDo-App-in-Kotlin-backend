package com.example.todo.exceptions

class InvalidEmailException: RuntimeException {
    val type: Any
    val field: String
    val status = 416

    constructor(message: String, type: Any, field: String): super(message){
        this.field = field
        this.type = type
    }
}