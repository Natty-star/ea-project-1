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
public
class CourseOffering {
    @Id
    @GeneratedValue
    private int id;
    private String code;
    @ManyToOne
    private Course course;
    @ManyToOne
    private Faculty faculty;
    @ManyToOne
    private AcademicBlock block;
    @OneToMany
    private List<Registration> registrations;
    @OneToMany
    private List<RegistrationRequest> registrationRequests;
    private int capacity;
    private int availableSeats;

}
