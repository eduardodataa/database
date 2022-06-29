package com.h2.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.h2.database.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
