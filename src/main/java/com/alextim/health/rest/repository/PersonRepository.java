package com.alextim.health.rest.repository;

import com.alextim.health.rest.entry.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
