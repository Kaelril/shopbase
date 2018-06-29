package com.muraviev.shopbase2.controllers;

import com.muraviev.shopbase2.entity.ProductCharacteristic;
import com.muraviev.shopbase2.exceptions.IdNotFoundException;
import com.muraviev.shopbase2.interfaces.ProductCharacteristicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductCharacteristicController {

    @Autowired
    private ProductCharacteristicsRepository productCharacteristicsRepository;

    @GetMapping("/ProdChar")
    public List<ProductCharacteristic> retrieveAllProductCharacteristics() {
        return productCharacteristicsRepository.findAll();
    }

    @GetMapping("/ProdChar/{Id}")
    public ProductCharacteristic retrieveProductCharacteristic(@PathVariable long Id) {
        Optional<ProductCharacteristic> productCharacteristic = productCharacteristicsRepository.findById(Id);

        if (!productCharacteristic.isPresent())
            throw new IdNotFoundException("id-" + Id);

        return productCharacteristic.get();
    }
}
