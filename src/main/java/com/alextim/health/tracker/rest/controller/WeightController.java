package com.alextim.health.tracker.rest.controller;

import com.alextim.health.tracker.rest.controller.request.WeightRequest;
import com.alextim.health.tracker.rest.controller.response.WeightResponse;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weights")
public class WeightController {
    @GetMapping
    public List<WeightResponse> weights(@ParameterObject Pageable pageable) {
        throw new IllegalArgumentException("Not implemented");
    }

    @PutMapping("/person/{personId}")
    @ResponseStatus(HttpStatus.CREATED)
    public void weight(@PathVariable Long personId, @Validated WeightRequest weightDto) {
        throw new IllegalArgumentException("Not implemented");
    }

    @DeleteMapping("/{weightId}")
    public void weight(@PathVariable Long weightId) {
        throw new IllegalArgumentException("Not implemented");
    }
}
