package com.springboot.hotelmanagement.repository;

import com.springboot.hotelmanagement.enitity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    //no code required
}
