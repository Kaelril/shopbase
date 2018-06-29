package com.muraviev.shopbase2.controllers;

import com.muraviev.shopbase2.entity.OrdersProduct;
import com.muraviev.shopbase2.exceptions.IdNotFoundException;
import com.muraviev.shopbase2.interfaces.OrdersProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class OrdersProductController {

    @Autowired
    private OrdersProductRepository ordersProductRepository;

    @GetMapping("/OrdersProd")
    public List<OrdersProduct> retrieveAllOrdersProduct() {
        return ordersProductRepository.findAll();
    }

    @GetMapping("/OrdersProd/{Id}")
    public OrdersProduct retrieveOrdersProduct(@PathVariable long Id) {
        Optional<OrdersProduct> ordersProduct = ordersProductRepository.findById(Id);

        if (!ordersProduct.isPresent())
            throw new IdNotFoundException("id-" + Id);

        return ordersProduct.get();
    }

}
