package com.alextim.health.rest.controller.mapper;

import com.alextim.health.rest.controller.response.OccasionResponse;
import com.alextim.health.rest.entry.Occasion;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OccasionRequestResponseMapper {
    List<OccasionResponse> toResponses(List<Occasion> occasions);
}
