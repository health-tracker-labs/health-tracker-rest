package com.alextim.health.rest.repository;

import com.alextim.health.rest.entry.Occasion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OccasionRepository extends JpaRepository<Occasion, Long> {
}
