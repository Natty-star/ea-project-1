package com.example.eaproject1.repository;



import com.example.eaproject1.Domian.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface PersonRepository extends JpaRepository<Person,Long> {

}
