package com.springboot.hotelmanagement.controller;

import com.springboot.hotelmanagement.enitity.Customer;
import com.springboot.hotelmanagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/customers")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService theCustomerService){
        customerService=theCustomerService;
    }

    @GetMapping("/showAll")
    public String findAll(Model theModel){
        List<Customer> Customers= customerService.findAll();

        theModel.addAttribute("customers", Customers);
        return "customers/showCustomers";
    }

    @GetMapping("/showFormForAdd")
    public String addCustomer(Model theModel){
        Customer theCustomer= new Customer();
        theModel.addAttribute("customer", theCustomer);
        return "customers/customer-form";
    }

    @PostMapping("/save")
    public String saveCustomer(@ModelAttribute("customer") Customer theCustomer){
        customerService.save(theCustomer);
        return "redirect:/customers/showAll";
    }

    @GetMapping("/showFormForUpdate")
    public String updateCustomer(@RequestParam("customerId") int theId, Model theModel){
        Customer theCustomer= customerService.findById(theId);
        theModel.addAttribute(theCustomer);
        return "customers/customer-form";
    }

    @GetMapping("/deleteById")
    public String delteCustomer(@RequestParam("customerId") int theId){
        customerService.deleteById(theId);
        return "redirect:/customers/showAll";
    }


}
