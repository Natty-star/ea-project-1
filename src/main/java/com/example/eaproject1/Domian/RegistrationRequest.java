package com.example.eaproject1.Domian;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class RegistrationRequest {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    private Student student;
    @ManyToMany
    private List<CourseOffering> courseOffering;
    private int priorityNumber;
}
