package com.example.eaproject1.repository;



import com.example.eaproject1.Domian.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {
}
