package com.example.todo.entities

import jakarta.persistence.*
import lombok.Getter
import lombok.Setter
import java.util.Date
import java.util.UUID


@Getter
@Setter
@Entity
@Table(name = "confirmation_token")
class ConfirmationToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id : Long? = null

    @Column(name = "token")
    var token : String? = null

    @Temporal(TemporalType.TIMESTAMP)
    var createdDate : Date = Date()

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    var user : User? = null

    constructor()
    constructor(user: User){
        this.user = user
        this.createdDate = Date()
        this.token = UUID.randomUUID().toString()
    }
}