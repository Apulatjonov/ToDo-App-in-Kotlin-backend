package com.example.todo.repositories;

import com.example.todo.entities.Todo
import org.springframework.data.jpa.repository.JpaRepository

interface TodoRepository : JpaRepository<Todo, Long> {
}