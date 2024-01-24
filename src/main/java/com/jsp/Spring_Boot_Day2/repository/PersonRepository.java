package com.jsp.Spring_Boot_Day2.repository;

import com.jsp.Spring_Boot_Day2.dto.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {
}
