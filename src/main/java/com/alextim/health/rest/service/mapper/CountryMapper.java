package com.alextim.health.rest.service.mapper;

import com.alextim.health.rest.entry.Country;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CountryMapper {
    List<Country> toCountries(Iterable<Country> countries);
}
