package com.muraviev.shopbase2.interfaces;

import com.muraviev.shopbase2.entity.ProductCharacteristic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCharacteristicsRepository extends JpaRepository<ProductCharacteristic, Long> {
}
