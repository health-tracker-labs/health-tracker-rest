package com.alextim.health.tracker.rest.service;

import com.alextim.health.tracker.rest.persistence.entity.Occasion;
import com.alextim.health.tracker.rest.persistence.repository.OccasionRepository;
import com.alextim.health.tracker.rest.service.mapper.OccasionMapper;
import jakarta.annotation.Resource;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OccasionService {
    @Resource
    private OccasionRepository occasionRepository;
    @Resource
    private OccasionMapper occasionMapper;

    public List<Occasion> getOccasions(Pageable pageable) {
        return occasionRepository.findAll(pageable)
                .stream()
                .toList();
    }
}
