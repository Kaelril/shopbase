package com.muraviev.shopbase2.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "orders")
public class CustomerOrders implements Serializable {

    @Id
    @Column(name = "orders_id")
    private long Id;

    private Date date_order;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Customer customer;
    private int price_order;

    @OneToMany(mappedBy = "orders")
    private Collection<OrdersProduct> ordersProducts;

    public CustomerOrders() {
        super();
    }

    public CustomerOrders(Long Id, Date date_order, Customer customer, Integer price_order, Collection<OrdersProduct> ordersProducts) {
        super();
        this.Id = Id;
        this.date_order = date_order;
        this.customer = customer;
        this.price_order = price_order;
        this.ordersProducts = ordersProducts;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public Date getDate_order() {
        return date_order;
    }

    public void setDate_order(Date date_order) {
        this.date_order = date_order;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getPrice_order() {
        return price_order;
    }

    public void setPrice_order(int price_order) {
        this.price_order = price_order;
    }

    public Collection<OrdersProduct> getOrdersProducts() {
        return ordersProducts;
    }

    public void setOrdersProducts(Collection<OrdersProduct> ordersProducts) {
        this.ordersProducts = ordersProducts;
    }
}
