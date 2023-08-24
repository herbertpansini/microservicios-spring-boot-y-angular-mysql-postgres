package com.vaxi.springbootmicroservice2compra.repository;

import com.vaxi.springbootmicroservice2compra.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompraRepositroy extends JpaRepository<Compra, Long> {
    List<Compra> findAllByUserId(long userId);
}