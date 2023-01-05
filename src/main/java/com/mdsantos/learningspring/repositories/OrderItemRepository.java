package com.mdsantos.learningspring.repositories;

import com.mdsantos.learningspring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
