package com.alextim.health.rest.entry;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "occasions")
public class Occasion {
    @Id
    @SequenceGenerator(name = "OCCASION_SEQ", sequenceName = "OCCASION_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "OCCASION_SEQ")
    private Long id;

}
