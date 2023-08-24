package com.vaxi.springbootmicroservice2compra.service;

import com.vaxi.springbootmicroservice2compra.model.Compra;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CompraService {
    Compra saveCompra(Compra compra);

    @Transactional(readOnly = true)
    List<Compra> findAllComprasOfUser(long userId);
}
