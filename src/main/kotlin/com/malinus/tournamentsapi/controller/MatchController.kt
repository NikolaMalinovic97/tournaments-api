package com.malinus.tournamentsapi.controller

import com.malinus.tournamentsapi.service.MatchService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/matches")
class MatchController(val matchService: MatchService) {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getMatches() = matchService.getMatches()
}
