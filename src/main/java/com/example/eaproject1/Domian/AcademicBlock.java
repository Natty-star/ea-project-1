package com.example.eaproject1.Domian;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public
class AcademicBlock {
  @Id
  @GeneratedValue
    private Long id;
    private String code;
    private String name;
    private String semester;
    private Date startDate;
    private Date endDate;

    @OneToMany(mappedBy = "block")
    private List<CourseOffering> courseOfferings;
    @ManyToMany(mappedBy = "blocks")
    private List<RegistrationGroup> registrationGroups;

}
