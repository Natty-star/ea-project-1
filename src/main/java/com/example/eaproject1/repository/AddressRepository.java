package com.example.eaproject1.repository;


import com.example.eaproject1.Domian.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {
}
