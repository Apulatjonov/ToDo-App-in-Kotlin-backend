package com.example.todo.repositories

import com.example.todo.entities.ConfirmationToken
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository("confirmationTokenRepository")
interface ConfirmationTokenRepository: JpaRepository<ConfirmationToken, Long> {
    fun findByToken (token: String) : Optional<ConfirmationToken>
    fun findConfirmationTokenByUserId(id: Long) : Optional<ConfirmationToken>
}