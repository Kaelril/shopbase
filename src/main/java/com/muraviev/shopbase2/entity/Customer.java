package com.muraviev.shopbase2.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {

    @Id
    @Column(name = "customer_id")
    private long customer_id;

    private String card_customer;

    private int discount_customer;

    @OneToMany(mappedBy = "customer")
    private Collection<CustomerOrders> customerOrders;

    public Customer() {
        super();
    }

    public Customer(Long customer_id, String card_customer, Integer discount_customer, Collection<CustomerOrders> customerOrders) {
        super();
        this.customer_id = customer_id;
        this.card_customer = card_customer;
        this.discount_customer = discount_customer;
        this.customerOrders = customerOrders;
    }

    public long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(long customer_id) {
        this.customer_id = customer_id;
    }

    public String getCard_customer() {
        return card_customer;
    }

    public void setCard_customer(String card_customer) {
        this.card_customer = card_customer;
    }

    public int getDiscount_customer() {
        return discount_customer;
    }

    public void setDiscount_customer(int discount_customer) {
        this.discount_customer = discount_customer;
    }

    public Collection<CustomerOrders> getCustomerOrders() {
        return customerOrders;
    }

    public void setCustomerOrders(Collection<CustomerOrders> customerOrders) {
        this.customerOrders = customerOrders;
    }
}
