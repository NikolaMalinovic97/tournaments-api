package com.malinus.tournamentsapi.model.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.util.*

@Entity
data class Match(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: UUID? = null,
    @ManyToOne
    @JoinColumn(name = "competition_id")
    @JsonIgnore
    val competition: Competition? = null,
    @ManyToOne
    @JoinColumn(name = "home_competitor_id")
    val homeCompetitor: Competitor? = null,
    @ManyToOne
    @JoinColumn(name = "away_competitor_id")
    val awayCompetitor: Competitor? = null,
    val homeCompetitorGoals: Byte = 0,
    val awayCompetitorGoals: Byte = 0,
    val round: Byte = 0
)
