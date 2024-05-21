package com.malinus.tournamentsapi.service

import com.malinus.tournamentsapi.model.entity.Competition
import com.malinus.tournamentsapi.repository.CompetitionRepository
import org.springframework.stereotype.Service

@Service
class CompetitionService(val competitionRepository: CompetitionRepository) {

    fun getCompetitions(): List<Competition> = competitionRepository.findAll()
}
