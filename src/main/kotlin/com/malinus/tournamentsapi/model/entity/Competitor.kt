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
data class Competitor(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: UUID? = null,
    val ranking: Byte = 0,
    @ManyToOne
    @JoinColumn(name = "competition_id")
    @JsonIgnore
    val competition: Competition? = null,
    @ManyToOne
    @JoinColumn(name = "user_id")
    val user: User? = null,
)
