package com.alextim.health.tracker.rest.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "countries")
public class Country {
    @Id
    @SequenceGenerator(name = "COUNTRY_SEQ", sequenceName = "COUNTRY_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "COUNTRY_SEQ")
    private Long id;

    private String name;
}
