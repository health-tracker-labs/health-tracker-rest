package com.alextim.health.tracker.rest.persistence.repository;

import com.alextim.health.tracker.rest.persistence.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
