package com.br.yan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.yan.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
