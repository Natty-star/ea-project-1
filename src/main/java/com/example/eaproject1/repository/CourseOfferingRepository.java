package com.example.eaproject1.repository;



import com.example.eaproject1.Domian.CourseOffering;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseOfferingRepository extends JpaRepository<CourseOffering,Long> {
}
