package com.muraviev.shopbase2.controllers;

import com.muraviev.shopbase2.entity.Product;
import com.muraviev.shopbase2.exceptions.IdNotFoundException;
import com.muraviev.shopbase2.interfaces.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/Product")
    public List<Product> retrieveAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/Product/{Id}")
    public Product retrieveProduct(@PathVariable long Id) {
        Optional<Product> product = productRepository.findById(Id);

        if (!product.isPresent())
            throw new IdNotFoundException("id-" + Id);

        return product.get();
    }
}
