package com.malinus.tournamentsapi.repository

import com.malinus.tournamentsapi.model.entity.Match
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface MatchRepository : JpaRepository<Match, UUID> {
}
