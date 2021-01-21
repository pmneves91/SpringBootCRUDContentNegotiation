package pt.pedroneves.springbootcrudcontentnegotiation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pt.pedroneves.springbootcrudcontentnegotiation.data.vo.PersonVO;
import pt.pedroneves.springbootcrudcontentnegotiation.services.PersonServices;

import java.util.List;

@RestController
@RequestMapping("/api/person/v1")
public class PersonController {

    @Autowired
    private PersonServices services;

    @GetMapping(produces = { "application/json", "application/xml" })
    public List<PersonVO> findAll() {
        return services.findAll();
    }

    @GetMapping(value = "/{id}", produces = { "application/json", "application/xml" })
    public PersonVO findById(@PathVariable("id") Long id) {
        return services.findById(id);
    }

    @PostMapping(produces = { "application/json", "application/xml" },
            consumes = { "application/json", "application/xml" })
    public PersonVO create(@RequestBody PersonVO person) {
        return services.create(person);
    }

    @PutMapping(produces = { "application/json", "application/xml" },
            consumes = { "application/json", "application/xml" })
    public PersonVO update(@RequestBody PersonVO person) {
        return services.update(person);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        services.delete(id);
    }
}
