package com.muraviev.shopbase2.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ordersproduct")
public class OrdersProduct implements Serializable {

    @Id
    @Column(name = "orderprod_id")
    private long Id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "orders_id")
    private CustomerOrders orders;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "prod_id")
    private Product product;
    private int prod_quant;

    public OrdersProduct() {
        super();
    }

    public OrdersProduct(Long Id, CustomerOrders orders, Product product, Integer prod_quant) {
        super();
        this.Id = Id;
        this.orders = orders;
        this.product = product;
        this.prod_quant = prod_quant;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public CustomerOrders getOrders() {
        return orders;
    }

    public void setOrders(CustomerOrders orders) {
        this.orders = orders;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getProd_quant() {
        return prod_quant;
    }

    public void setProd_quant(int prod_quant) {
        this.prod_quant = prod_quant;
    }
}
