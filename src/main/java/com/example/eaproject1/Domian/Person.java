package com.example.eaproject1.Domian;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;


@Data
@Entity
@Inheritance()
public abstract class Person {
    @Id
    @GeneratedValue
    private Long id;

    private String fistName;

    private String lastName;

    private String email;

}