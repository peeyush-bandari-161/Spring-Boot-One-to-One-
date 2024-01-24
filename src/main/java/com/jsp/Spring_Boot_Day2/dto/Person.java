package com.jsp.Spring_Boot_Day2.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Person1")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personId;
    private String personName;
    private String personAddress;
    private long personPhone;
    private int personAge;
    @OneToOne(cascade = CascadeType.ALL)
    private Pancard pancard;

}
