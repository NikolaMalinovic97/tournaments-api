package com.malinus.tournamentsapi.service

import com.malinus.tournamentsapi.model.entity.Match
import com.malinus.tournamentsapi.repository.MatchRepository
import org.springframework.stereotype.Service

@Service
class MatchService(val matchRepository: MatchRepository) {

    fun getMatches(): List<Match> = matchRepository.findAll()
}
