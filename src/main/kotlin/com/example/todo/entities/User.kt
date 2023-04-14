package com.example.todo.entities

import jakarta.persistence.*

@Entity
@Table(name = "users")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "todo_seq")
    @Column(name = "id", nullable = false)
    var id: Long? = null

    @Column(name = "email")
    lateinit var email:String;

    @Column(name = "password")
    lateinit var password : String

    @Column(name = "verified")
    var verified : Boolean = false;

}