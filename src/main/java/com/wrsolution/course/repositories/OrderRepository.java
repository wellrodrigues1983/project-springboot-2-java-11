package com.wrsolution.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wrsolution.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
