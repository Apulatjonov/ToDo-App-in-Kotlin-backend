package com.example.todo.mappers

import com.example.todo.dtos.UserDto
import com.example.todo.entities.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Component

@Component
class UserMapper : Mapper<User, UserDto> {

    @Autowired
    lateinit var passwordEncoder : PasswordEncoder

    override fun mapToDto(userEntity: User): UserDto {
        var user = UserDto()
        user.id = userEntity.id!!
        user.email = userEntity.email
        user.password = userEntity.password
        user.verified = userEntity.verified
        return user;
    }

    override fun mapToEntity(dto: UserDto): User {
        var user = User()
        user.id = dto.id
        user.email = dto.email
        user.password = passwordEncoder.encode(dto.password)
        user.verified = dto.verified
        return user
    }

    fun checkPassword(raw: String, pass: String) : Boolean{
        return passwordEncoder.matches(raw, pass)
    }

    fun encodePassword(password: String) : String {
        return passwordEncoder.encode(password)
    }
}