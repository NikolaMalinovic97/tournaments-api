package com.malinus.tournamentsapi.service

import com.malinus.tournamentsapi.model.entity.User
import com.malinus.tournamentsapi.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(val userRepository: UserRepository) {

    fun getUsers(): List<User> = userRepository.findAll()
}
