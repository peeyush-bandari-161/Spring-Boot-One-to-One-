package com.jsp.Spring_Boot_Day2.service;

import com.jsp.Spring_Boot_Day2.dto.Person;
import com.jsp.Spring_Boot_Day2.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    public Person savePerson(Person person){
        return personRepository.save(person);
    }
    public Person findPerson(int id){
        Person person=personRepository.findById(id).get();
        personRepository.save(person);
        return  person;
    }
    public Person deletePerson(int id){
        Person person=personRepository.findById(id).get();
        personRepository.deleteById(id);
        return person;
    }
    public Person updatePerson(Person person,int id){
        Person existingPerson=personRepository.findById(id).get();
        existingPerson.setPersonName(person.getPersonName());
        existingPerson.setPersonAddress(person.getPersonAddress());
        existingPerson.setPersonPhone(person.getPersonPhone());
        existingPerson.setPersonAge(person.getPersonAge());
        existingPerson.setPancard(person.getPancard());
        return personRepository.save(existingPerson);
    }
}
