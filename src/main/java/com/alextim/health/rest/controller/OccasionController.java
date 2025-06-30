package com.alextim.health.rest.controller;

import com.alextim.health.rest.controller.mapper.OccasionRequestResponseMapper;
import com.alextim.health.rest.controller.request.OccasionRequest;
import com.alextim.health.rest.controller.response.OccasionResponse;
import com.alextim.health.rest.service.OccasionService;
import jakarta.annotation.Resource;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/occasions")
public class OccasionController {
    @Resource
    private OccasionService occasionService;
    @Resource
    private OccasionRequestResponseMapper occasionMapper;

    @GetMapping
    public List<OccasionResponse> getOccasions(@ParameterObject Pageable pageable) {
        return occasionMapper.toResponses(occasionService.getOccasions(pageable));
    }

    @PutMapping("/person/{personId}")
    @ResponseStatus(HttpStatus.CREATED)
    public void createOccasion(@PathVariable Long personId, @Validated OccasionRequest occasionRequest) {
        throw new IllegalArgumentException("Not implemented");
    }

    @DeleteMapping("/{occasionId}")
    public void deleteOccasion(@PathVariable Long occasionId) {
        throw new IllegalArgumentException("Not implemented");
    }
}
