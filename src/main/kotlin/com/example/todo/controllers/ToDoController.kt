package com.example.todo.controllers

import com.example.todo.entities.Todo
import com.example.todo.repositories.TodoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/todos")
class ToDoController (val todoRepository: TodoRepository){

    @Autowired
    lateinit var passwordEncoder: PasswordEncoder

    @PostMapping
    fun newTodo(@RequestBody todo: Todo):Todo{
        return todoRepository.save(todo);
    }
}