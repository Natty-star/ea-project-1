package com.example.eaproject1.Domian;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public
class RegistrationEvent {
    @Id
    @GeneratedValue
    private long id;
    private Date startDate;
    private Date endDate;
    @OneToMany
    private List<RegistrationGroup> registrationGroups;
}
