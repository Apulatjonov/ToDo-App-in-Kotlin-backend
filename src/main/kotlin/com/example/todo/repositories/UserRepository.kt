package com.example.todo.repositories

import com.example.todo.entities.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
public interface UserRepository : JpaRepository<User, Long>{
    fun findByEmail(email: String) : Optional<User>
    fun existsByEmail(email: String): Boolean
}