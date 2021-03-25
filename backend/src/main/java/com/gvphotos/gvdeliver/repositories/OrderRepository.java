package com.gvphotos.gvdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gvphotos.gvdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}