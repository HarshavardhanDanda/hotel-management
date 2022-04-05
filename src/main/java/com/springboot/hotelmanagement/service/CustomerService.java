package com.springboot.hotelmanagement.service;

import com.springboot.hotelmanagement.enitity.Customer;

import java.util.List;

public interface CustomerService {
     List<Customer> findAll();

     Customer findById(int theId);

     void save(Customer theCustomer);

     public void deleteById(int theId);

    List<Customer> findCustomers(int theId);

}
