package com.example.todo.controllers

import com.example.todo.dtos.UserDto
import com.example.todo.entities.Todo
import com.example.todo.repositories.UserRepository
import com.example.todo.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController {

    @Autowired
    lateinit var userService: UserService

    @PostMapping("/signUp")
    fun registerUser(@RequestBody dto: UserDto): ResponseEntity<Any> {
        val user = userService.registerUser(dto)
        return ResponseEntity.ok(user as Any);
    }

    @GetMapping("/verifyAccount")
    fun verifyAccount(@RequestParam("token") token: String): ResponseEntity<Any>{
        return ResponseEntity.ok(userService.confirmUserAccount(token) as Any)
    }

    @PostMapping("/signIn")
    fun signIn(@RequestBody dto: UserDto): ResponseEntity<Any>{
        val user = userService.login(dto)
        return ResponseEntity.ok(user)
    }

    @GetMapping("/requestToken")
    fun requestToken(@RequestParam("email") email: String): ResponseEntity<Any>{
        return ResponseEntity.ok(userService.resetPassword(email))
    }

    @PostMapping("/resetPasswordByToken")
    fun changePassword(@RequestParam("token") token: String, @RequestBody user: UserDto): ResponseEntity<Any>{
        return ResponseEntity.ok(userService.changePassword(token, user))
    }
}