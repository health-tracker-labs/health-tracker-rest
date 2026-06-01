package com.alextim.health.tracker.rest.persistence.repository;

import com.alextim.health.tracker.rest.persistence.entity.Occasion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OccasionRepository extends JpaRepository<Occasion, Long> {
}
