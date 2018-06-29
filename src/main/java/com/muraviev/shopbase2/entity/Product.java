package com.muraviev.shopbase2.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "products")
public class Product implements Serializable {

    @Id
    @Column(name = "prod_id")
    private long Id;

    private String name_product;

    private int price_product;

    private String desc_product;

    @OneToMany(mappedBy = "product")
    private Collection<ProductCharacteristic> productCharacteristics;

    @OneToMany(mappedBy = "product")
    private Collection<OrdersProduct> ordersProducts;

    public Product() {
        super();
    }

    public Product(Long Id, String name_product, Integer price_product,
                   String desc_product, Collection<ProductCharacteristic> productCharacteristics, Collection<OrdersProduct> ordersProducts) {
        super();
        this.Id = Id;
        this.name_product = name_product;
        this.price_product = price_product;
        this.desc_product = desc_product;
        this.productCharacteristics = productCharacteristics;
        this.ordersProducts = ordersProducts;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public int getPrice_product() {
        return price_product;
    }

    public void setPrice_product(int price_product) {
        this.price_product = price_product;
    }

    public String getDesc_product() {
        return desc_product;
    }

    public void setDesc_product(String desc_product) {
        this.desc_product = desc_product;
    }

    public Collection<ProductCharacteristic> getProductCharacteristics() {
        return productCharacteristics;
    }

    public void setProductCharacteristics(Collection<ProductCharacteristic> productCharacteristics) {
        this.productCharacteristics = productCharacteristics;
    }

    public Collection<OrdersProduct> getOrdersProducts() {
        return ordersProducts;
    }

    public void setOrdersProducts(Collection<OrdersProduct> ordersProducts) {
        this.ordersProducts = ordersProducts;
    }
}
