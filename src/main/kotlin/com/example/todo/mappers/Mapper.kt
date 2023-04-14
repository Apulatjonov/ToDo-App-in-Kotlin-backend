package com.example.todo.mappers

interface Mapper <T, D>{
    fun mapToDto(t : T) : D
    fun mapToEntity(d : D) : T
}