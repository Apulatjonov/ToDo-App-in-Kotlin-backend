package com.example.todo.exceptions

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ExceptionAdvice {

    @ExceptionHandler
    fun handleUserAlreadyExistException(ex: UserAlreadyExistException): ResponseEntity<ExceptionResponse>{
        var response = ExceptionResponse(ex.field, ex.message, ex.status)
        return ResponseEntity(response, HttpStatus.BAD_REQUEST)
    }

    @ExceptionHandler
    fun handleInvalidEmailException(ex: InvalidEmailException): ResponseEntity<ExceptionResponse>{
        var response = ExceptionResponse(ex.field, ex.message, ex.status)
        return ResponseEntity(response, HttpStatus.BAD_REQUEST)
    }

    @ExceptionHandler
    fun handleInvalidPasswordException(ex: InvalidPasswordException): ResponseEntity<ExceptionResponse>{
        var response = ExceptionResponse(ex.field, ex.message, ex.status)
        return ResponseEntity(response, HttpStatus.BAD_REQUEST)
    }

    @ExceptionHandler
    fun handleNotFoundException(ex: NotFoundException): ResponseEntity<ExceptionResponse>{
        var response = ExceptionResponse(ex.field, ex.message, ex.status)
        return ResponseEntity(response, HttpStatus.BAD_REQUEST)
    }

    @ExceptionHandler
    fun handleNotVerifiedAccountException(ex: NotVerifiedAccountException): ResponseEntity<ExceptionResponse>{
        var response = ExceptionResponse(ex.field, ex.message, ex.status)
        return ResponseEntity(response, HttpStatus.BAD_REQUEST)
    }

    @ExceptionHandler
    fun handleUserAlreadyVerifiedException(ex: UserAlreadyVerifiedException): ResponseEntity<ExceptionResponse>{
        var response = ExceptionResponse(ex.field, ex.message, ex.status)
        return ResponseEntity(response, HttpStatus.BAD_REQUEST)
    }

    @ExceptionHandler
    fun handleUserNotFoundException(ex: UserNotFoundException): ResponseEntity<ExceptionResponse>{
        var response = ExceptionResponse(ex.field, ex.message, ex.status)
        return ResponseEntity(response, HttpStatus.BAD_REQUEST)
    }

    @ExceptionHandler
    fun handleTokenNotFoundException(ex: TokenNotFoundException): ResponseEntity<ExceptionResponse>{
        var response = ExceptionResponse(ex.field, ex.message, ex.status)
        return ResponseEntity(response, HttpStatus.BAD_REQUEST)
    }

    @ExceptionHandler
    fun handleTokenAlreadyUsedException(ex: TokenAlreadyUsedException): ResponseEntity<ExceptionResponse>{
        var response = ExceptionResponse(ex.field, ex.message, ex.status)
        return ResponseEntity(response, HttpStatus.BAD_REQUEST)
    }
}