package com.muraviev.shopbase2.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PRODUCTCHARACTERISTIC")
public class ProductCharacteristic implements Serializable {

    @Id
    @Column(name = "prodchar_id")
    private long Id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "prod_id")
    private Product product;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "char_id")
    private Characteristic characteristic;

    private String char_value;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Characteristic getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(Characteristic characteristic) {
        this.characteristic = characteristic;
    }

    public String getChar_value() {
        return char_value;
    }

    public void setChar_value(String char_value) {
        this.char_value = char_value;
    }
}
