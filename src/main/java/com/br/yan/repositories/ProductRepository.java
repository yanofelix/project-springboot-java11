package com.br.yan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.yan.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
