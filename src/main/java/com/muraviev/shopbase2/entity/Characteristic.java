package com.muraviev.shopbase2.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "characteristic")
public class Characteristic implements Serializable {

    @Id
    @Column(name = "char_id")
    private long Id;

    private String name_characteristic;

    @OneToMany(mappedBy = "characteristic")
    private Collection<ProductCharacteristic> productCharacteristics;

    public Characteristic() {
        super();
    }

    public Characteristic(Long Id, String name_characteristic, Collection<ProductCharacteristic> productCharacteristics) {
        super();
        this.Id = Id;
        this.name_characteristic = name_characteristic;
        this.productCharacteristics = productCharacteristics;
    }

    public Collection<ProductCharacteristic> getProductCharacteristics() {
        return productCharacteristics;
    }

    public void setProductCharacteristics(Collection<ProductCharacteristic> productCharacteristics) {
        this.productCharacteristics = productCharacteristics;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }


    public String getName_characteristic() {
        return name_characteristic;
    }

    public void setName_characteristic(String name_characteristic) {
        this.name_characteristic = name_characteristic;
    }


}
