package com.springboot.hotelmanagement.service;

import com.springboot.hotelmanagement.enitity.Customer;

import java.util.List;

public interface CustomerService {
     public List<Customer> findAll();

     public Customer findById(int theId);

     public void save(Customer theCustomer);

     public void deleteById(int theId);
}
