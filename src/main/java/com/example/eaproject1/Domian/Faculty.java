package com.example.eaproject1.Domian;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public
class Faculty extends Person {
    private Long id;
    private String name;
    private String email;
    private String title;
    @OneToMany(mappedBy = "faculty")
    private List<CourseOffering> courseOfferings;
}
