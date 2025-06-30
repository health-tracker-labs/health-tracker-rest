package com.alextim.health.rest.service;

import com.alextim.health.rest.entry.Country;
import com.alextim.health.rest.repository.CountryRepository;
import com.alextim.health.rest.service.mapper.CountryMapper;
import jakarta.annotation.Resource;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    private static final String COUNTRY_NOT_FOUND_MSG = "Country with id = %d doesn't exist";

    @Resource
    private CountryRepository countryRepository;
    @Resource
    private CountryMapper countryMapper;

    public List<Country> getCountries(Pageable pageable) {
        return countryMapper.toCountries(countryRepository.findAll(pageable));
    }

    public Country getCountryById(Long countryId) {
        return countryRepository
                .findById(countryId)
                .orElseThrow(() -> new IllegalArgumentException(String.format(COUNTRY_NOT_FOUND_MSG, countryId)));
    }
}
