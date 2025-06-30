package com.alextim.health.rest.repository;

import com.alextim.health.rest.entry.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
