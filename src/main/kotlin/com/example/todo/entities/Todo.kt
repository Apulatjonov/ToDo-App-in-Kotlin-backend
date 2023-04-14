package com.example.todo.entities

import jakarta.persistence.*

@Entity
@Table(name = "todo")
class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "todo_seq")
    @Column(name = "id", nullable = false)
    var id: Long? = null

    @Column(name = "title")
    var title: String? = null

    @Column(name = "completed")
    var completed: Boolean? = false
}