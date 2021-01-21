package pt.pedroneves.springbootcrudvalueobject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pt.pedroneves.springbootcrudvalueobject.data.vo.PersonVO;
import pt.pedroneves.springbootcrudvalueobject.services.PersonServices;

import java.util.List;

@RestController
@RequestMapping("/api/person/v1")
public class PersonController {

    @Autowired
    private PersonServices services;

    @GetMapping
    public List<PersonVO> findAll() {
        return services.findAll();
    }

    @GetMapping("/{id}")
    public PersonVO findById(@PathVariable("id") Long id) {
        return services.findById(id);
    }

    @PostMapping
    public PersonVO create(@RequestBody PersonVO person) {
        return services.create(person);
    }

    @PutMapping
    public PersonVO update(@RequestBody PersonVO person) {
        return services.update(person);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        services.delete(id);
    }
}
