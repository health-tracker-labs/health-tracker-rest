package com.alextim.health.rest.controller.mapper;

import com.alextim.health.rest.controller.response.CountryResponse;
import com.alextim.health.rest.entry.Country;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CountryRequestResponseMapper {
    List<CountryResponse> toResponses(List<Country> countries);
    CountryResponse toResponse(Country country);
}
