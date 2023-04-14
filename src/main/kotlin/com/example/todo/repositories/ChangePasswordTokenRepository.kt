package com.example.todo.repositories

import com.example.todo.entities.ChangePasswordToken
import com.example.todo.entities.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ChangePasswordTokenRepository: JpaRepository<ChangePasswordToken, Long>{
    fun findAllByUserId(id: Long): Optional<List<ChangePasswordToken>>
    fun findByToken(token: String): Optional<ChangePasswordToken>
}