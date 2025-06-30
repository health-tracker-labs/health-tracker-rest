package com.alextim.health.rest.service;

import com.alextim.health.rest.controller.request.PersonRequest;
import com.alextim.health.rest.entry.Person;
import com.alextim.health.rest.repository.PersonRepository;
import com.alextim.health.rest.service.mapper.PersonMapper;
import jakarta.annotation.Resource;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Objects.nonNull;

@Service
public class PersonService {
    @Resource
    private PersonRepository personRepository;
    @Resource
    private CountryService countryService;
    @Resource
    private PersonMapper personMapper;

    public List<Person> getPersons(Pageable pageable) {
        return personRepository.findAll(pageable).stream().toList();
    }

    public Person createPerson(PersonRequest personRequest) {
        Person person = personMapper.toEntity(personRequest);

        Long countryId = personRequest.getCountryId();
        if (nonNull(countryId)) {
            person.setCountry(countryService.getCountryById(countryId));
        }

        return personRepository.save(person);
    }
}
