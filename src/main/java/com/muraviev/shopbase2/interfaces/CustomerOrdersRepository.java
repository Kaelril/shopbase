package com.muraviev.shopbase2.interfaces;

import com.muraviev.shopbase2.entity.CustomerOrders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerOrdersRepository extends JpaRepository<CustomerOrders, Long> {
}
