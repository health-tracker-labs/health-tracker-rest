package com.alextim.health.tracker.rest.service;

import com.alextim.health.tracker.rest.controller.request.PersonRequest;
import com.alextim.health.tracker.rest.persistence.entity.Person;
import com.alextim.health.tracker.rest.persistence.repository.PersonRepository;
import com.alextim.health.tracker.rest.service.mapper.PersonMapper;
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
