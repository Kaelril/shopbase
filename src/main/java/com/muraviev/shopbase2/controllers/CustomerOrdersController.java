package com.muraviev.shopbase2.controllers;

import com.muraviev.shopbase2.entity.CustomerOrders;
import com.muraviev.shopbase2.exceptions.IdNotFoundException;
import com.muraviev.shopbase2.interfaces.CustomerOrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerOrdersController {

    @Autowired
    private CustomerOrdersRepository customerOrdersRepository;

    @GetMapping("/Orders")
    public List<CustomerOrders> retrieveAllCustomerOrders() {
        return customerOrdersRepository.findAll();
    }

    @GetMapping("/Orders/{Id}")
    public CustomerOrders retrieveCustomerOrders(@PathVariable long Id) {
        Optional<CustomerOrders> customerOrders = customerOrdersRepository.findById(Id);

        if (!customerOrders.isPresent())
            throw new IdNotFoundException("id-" + Id);

        return customerOrders.get();
    }
}
