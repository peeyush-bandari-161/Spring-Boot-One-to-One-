package com.jsp.Spring_Boot_Day2.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Pancard1")
public class Pancard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pancardId;
    private String pancardNumber;


}
