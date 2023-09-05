package me.citiesapi;

import me.citiesapi.entities.Country;
import me.citiesapi.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryResource {
    @Autowired
    private CountryRepository repository;

    @GetMapping
    public Page<Country> findAllCountries(Pageable page) {
        return repository.findAll(page);
    }
}
