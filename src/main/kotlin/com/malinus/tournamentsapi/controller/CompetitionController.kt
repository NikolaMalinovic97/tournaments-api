package com.malinus.tournamentsapi.controller

import com.malinus.tournamentsapi.service.CompetitionService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/competitions")
class CompetitionController(val competitionService: CompetitionService) {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getCompetitions() = competitionService.getCompetitions()
}
