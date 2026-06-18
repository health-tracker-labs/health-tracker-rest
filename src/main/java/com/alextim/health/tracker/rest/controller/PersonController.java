package com.alextim.health.tracker.rest.controller;

import com.alextim.health.tracker.rest.controller.mapper.PersonRequestResponseMapper;
import com.alextim.health.tracker.rest.controller.request.PersonRequest;
import com.alextim.health.tracker.rest.controller.response.PersonResponse;
import com.alextim.health.tracker.rest.persistence.entity.Person;
import com.alextim.health.tracker.rest.service.PersonService;
import jakarta.annotation.Resource;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(path = "/persons")
public class PersonController {
    @Resource
    private PersonService personService;
    @Resource
    private PersonRequestResponseMapper request2ResponseMapper;

    @GetMapping
    public List<PersonResponse> getPersons(@ParameterObject Pageable pageable) {
        return request2ResponseMapper.toResponses(personService.getPersons(pageable));
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PersonResponse createPerson(@Validated @RequestBody PersonRequest request) {
        Person person = personService.createPerson(request);
        return request2ResponseMapper.toResponse(person);
    }

    @DeleteMapping("/{personId}")
    public ResponseEntity<Boolean> deletePerson(@PathVariable Long personId) {
        throw new IllegalArgumentException("Not implemented");
    }

    @GetMapping(path = "/{userName}")
    public Collection<PersonResponse> getPersonsByUserName(@PathVariable String userName){
        throw new IllegalArgumentException("Not implemented");
    }
}
