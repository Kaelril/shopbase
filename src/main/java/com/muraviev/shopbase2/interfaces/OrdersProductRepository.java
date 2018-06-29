package com.muraviev.shopbase2.interfaces;

import com.muraviev.shopbase2.entity.OrdersProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersProductRepository extends JpaRepository<OrdersProduct, Long> {
}
