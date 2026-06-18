package com.alextim.health.tracker.rest.controller.mapper;

import com.alextim.health.tracker.rest.controller.response.CountryResponse;
import com.alextim.health.tracker.rest.persistence.entity.Country;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CountryRequestResponseMapper {
    List<CountryResponse> toResponses(List<Country> countries);
    CountryResponse toResponse(Country country);
}
