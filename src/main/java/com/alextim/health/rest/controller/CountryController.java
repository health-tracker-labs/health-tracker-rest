package com.alextim.health.rest.controller;

import com.alextim.health.rest.controller.mapper.CountryRequestResponseMapper;
import com.alextim.health.rest.controller.response.CountryResponse;
import com.alextim.health.rest.service.CountryService;
import jakarta.annotation.Resource;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/countries")
public class CountryController {
    @Resource
    private CountryService countryService;

    @Resource
    private CountryRequestResponseMapper request2ResponseMapper;

    @GetMapping
    public List<CountryResponse> getCountries(@ParameterObject Pageable pageable) {
        return request2ResponseMapper.toResponses(countryService.getCountries(pageable));
    }
}
