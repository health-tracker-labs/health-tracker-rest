package com.alextim.health.tracker.rest.service.mapper;

import com.alextim.health.tracker.rest.persistence.entity.Country;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CountryMapper {
    List<Country> toCountries(Iterable<Country> countries);
}
