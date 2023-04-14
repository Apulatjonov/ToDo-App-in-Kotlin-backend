package com.example.todo.exceptions

class UserAlreadyVerifiedException: RuntimeException {
    val type: Object
    val field: String
    val status = 409

    constructor(message: String, type: Object, field: String): super(message){
        this.field = field
        this.type = type
    }
}