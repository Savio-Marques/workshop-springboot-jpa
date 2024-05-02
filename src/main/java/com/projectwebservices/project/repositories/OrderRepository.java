package com.projectwebservices.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projectwebservices.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
