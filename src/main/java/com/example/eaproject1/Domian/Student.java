package com.example.eaproject1.Domian;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student extends Person {

    private String studentId;
    private String name;
    private String email;
    @ManyToMany
    private List<Address> mailingAddress;
    @ManyToMany
   private List<Address> homeAddress;
    @OneToMany
    private List<Registration> registrations;
    @OneToMany
    private List<RegistrationEvent> registrationEvent;
    @OneToMany
    private List<RegistrationRequest> registrationRequests;
}
