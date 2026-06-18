package com.alextim.health.tracker.rest.controller.mapper;

import com.alextim.health.tracker.rest.controller.response.OccasionResponse;
import com.alextim.health.tracker.rest.persistence.entity.Occasion;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OccasionRequestResponseMapper {
    List<OccasionResponse> toResponses(List<Occasion> occasions);
}
