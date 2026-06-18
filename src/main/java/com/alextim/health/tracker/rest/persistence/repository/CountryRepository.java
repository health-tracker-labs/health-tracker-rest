package com.alextim.health.tracker.rest.persistence.repository;

import com.alextim.health.tracker.rest.persistence.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
