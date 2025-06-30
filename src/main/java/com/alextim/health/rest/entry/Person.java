package com.alextim.health.rest.entry;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "persons")
public class Person {
    @Id
    @SequenceGenerator(name = "PERSON_SEQ", sequenceName = "PERSON_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "PERSON_SEQ")
    private Long id;

    private String firstName;
    private String middleName;
    private String lastName;

    @ManyToOne
    @JoinColumn
    private Country country;

    private String city;

    private LocalDate birthDate;

    private String phone;
    private String mobilePhone;
    private String email;
}
