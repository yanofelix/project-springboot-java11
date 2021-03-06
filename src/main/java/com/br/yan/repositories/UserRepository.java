package com.br.yan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.yan.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
