package com.alextim.health.rest.service.mapper;

import com.alextim.health.rest.controller.request.PersonRequest;
import com.alextim.health.rest.entry.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    List<Person> toPersons(Iterable<Person> persons);

    @Mapping(target = "country", ignore = true)
    @Mapping(target = "lastName", source = "secondName")
    Person toEntity(PersonRequest personRequest);
}
