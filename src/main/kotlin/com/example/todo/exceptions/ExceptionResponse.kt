package com.example.todo.exceptions

class ExceptionResponse {
    lateinit var field: String
    var errorMessage: String? = null
    var status: Int = 0

    constructor(field: String, errorMessage: String?, status: Int){
        this.field = field
        this.errorMessage = errorMessage
        this.status = status
    }

}