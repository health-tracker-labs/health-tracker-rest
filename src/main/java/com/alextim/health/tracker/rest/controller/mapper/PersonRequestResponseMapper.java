package com.alextim.health.tracker.rest.controller.mapper;

import com.alextim.health.tracker.rest.controller.response.PersonResponse;
import com.alextim.health.tracker.rest.persistence.entity.Country;
import com.alextim.health.tracker.rest.persistence.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

import static java.util.Objects.nonNull;
import static org.apache.commons.lang3.StringUtils.*;

@Mapper(componentModel = "spring")
public interface PersonRequestResponseMapper {

    String FULL_NAME_FORMAT = "%s%s, %s";

    List<PersonResponse> toResponses(List<Person> persons);

    @Mapping(target = "name", source = "person", qualifiedByName = "toFullName")
    @Mapping(target = "country", source = "person.country", qualifiedByName = "toCountryName")
    PersonResponse toResponse(Person person);

    @Named("toCountryName")
    default String getCountryName(Country country) {
        return nonNull(country) ? country.getName() : EMPTY;
    }

    @Named("toFullName")
    default String getFullName(Person person) {
        String middleName = formatMiddleName(person.getMiddleName());
        return String.format(FULL_NAME_FORMAT, person.getLastName(),
                middleName, person.getFirstName());
    }

    private String formatMiddleName(String middleName) {
        return isEmpty(middleName) ? EMPTY : SPACE + middleName;
    }
}
