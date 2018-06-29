package com.muraviev.shopbase2.controllers;

import com.muraviev.shopbase2.entity.Customer;
import com.muraviev.shopbase2.exceptions.IdNotFoundException;
import com.muraviev.shopbase2.interfaces.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/Customer")
    public List<Customer> retrieveAllCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/Customer/{Id}")
    public Customer retrieveCustomer(@PathVariable long Id) {
        Optional<Customer> customer = customerRepository.findById(Id);

        if (!customer.isPresent())
            throw new IdNotFoundException("id-" + Id);

        return customer.get();
    }
}
