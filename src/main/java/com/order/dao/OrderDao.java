package com.order.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.entity.OrderEntity;
@Repository
public interface OrderDao extends JpaRepository<OrderEntity, Integer> {

}
