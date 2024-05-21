package com.malinus.tournamentsapi.controller

import com.malinus.tournamentsapi.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(val userService: UserService) {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getUsers() = userService.getUsers()
}
