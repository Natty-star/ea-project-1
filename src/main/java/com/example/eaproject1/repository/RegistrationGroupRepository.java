package com.example.eaproject1.repository;



import com.example.eaproject1.Domian.RegistrationGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationGroupRepository extends JpaRepository<RegistrationGroup,Long> {
}