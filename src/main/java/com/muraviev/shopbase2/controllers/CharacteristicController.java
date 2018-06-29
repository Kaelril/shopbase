package com.muraviev.shopbase2.controllers;

import com.muraviev.shopbase2.entity.Characteristic;
import com.muraviev.shopbase2.exceptions.IdNotFoundException;
import com.muraviev.shopbase2.interfaces.CharacteristicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CharacteristicController {

    @Autowired
    private CharacteristicRepository characteristicRepository;

    @GetMapping("/Characteristic")
    public List<Characteristic> retrieveAllCharacteristics() {
        return characteristicRepository.findAll();
    }

    @GetMapping("/Characteristic/{Id}")
    public Characteristic retrieveCharacteristic(@PathVariable long Id) {
        Optional<Characteristic> characteristic = characteristicRepository.findById(Id);

        if (!characteristic.isPresent())
            throw new IdNotFoundException("id-" + Id);

        return characteristic.get();
    }
}
