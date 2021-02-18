package com.br.yan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.yan.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
