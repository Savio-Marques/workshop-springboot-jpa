package com.projectwebservices.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectwebservices.project.entities.OrderItem;
import com.projectwebservices.project.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
