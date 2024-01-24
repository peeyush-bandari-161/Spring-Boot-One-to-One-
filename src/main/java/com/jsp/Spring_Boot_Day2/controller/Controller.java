package com.jsp.Spring_Boot_Day2.controller;

import com.jsp.Spring_Boot_Day2.dto.Person;
import com.jsp.Spring_Boot_Day2.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    private PersonService personService;
    @PostMapping("/person/save")
    public Person savePerson(@RequestBody Person person){
        return personService.savePerson(person);
    }
    @GetMapping("/person/fetch")
    public Person fetchPerson(int id){
        return personService.findPerson(id);
    }
    @DeleteMapping("/person/delete")
    public Person deletePerson(int id){
        return personService.deletePerson(id);
    }
    @PutMapping("/person/update")
    public Person updatePersonById(@RequestBody Person person,int id){
        return personService.updatePerson(person, id);
    }
}
