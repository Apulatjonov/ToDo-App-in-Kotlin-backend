package com.example.todo.entities

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "change_password_tokens")
class ChangePasswordToken{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "todo_seq")
    @Column(name = "id", nullable = false)
    var id: Long? = null

    @Column(name = "token")
    var token: String? = null

    @Temporal(TemporalType.TIMESTAMP)
    var createdDate: Date? = null

    var used: Boolean = false

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    var user: User? = null

    constructor()
    constructor(user: User){
        this.used = false;
        this.token = UUID.randomUUID().toString()
        this.createdDate = Date()
        this.user = user
    }
}