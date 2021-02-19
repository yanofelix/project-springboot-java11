package com.br.yan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.yan.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
