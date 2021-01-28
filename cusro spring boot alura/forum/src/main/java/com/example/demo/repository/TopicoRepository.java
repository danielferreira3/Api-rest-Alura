package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

}
