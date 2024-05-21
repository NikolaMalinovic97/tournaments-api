package com.malinus.tournamentsapi.model.entity

import com.fasterxml.jackson.annotation.JsonFormat
import jakarta.persistence.CascadeType
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.OffsetDateTime
import java.util.*

@Entity
data class Competition(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: UUID? = null,
    val name: String = "",
    @JsonFormat(pattern = "yyyy-MM-dd")
    val startAt: Date? = null,
    @JsonFormat(pattern = "yyyy-MM-dd")
    val endAt: Date? = null,
    @CreationTimestamp
    val createdAt: OffsetDateTime? = null,
    @UpdateTimestamp
    val updatedAt: OffsetDateTime? = null,
    @OneToMany(mappedBy = "competition", cascade = [CascadeType.ALL], orphanRemoval = true)
    val competitors: MutableList<Competitor> = mutableListOf(),
    @OneToMany(mappedBy = "competition", cascade = [CascadeType.ALL], orphanRemoval = true)
    val matches: MutableList<Match> = mutableListOf()
)
