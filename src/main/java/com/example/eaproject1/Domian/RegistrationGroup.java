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
class RegistrationGroup {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    private Student students;
    @ManyToOne
    private RegistrationEvent registrationEvent;
    @ManyToMany
    private List<AcademicBlock> blocks;
}
