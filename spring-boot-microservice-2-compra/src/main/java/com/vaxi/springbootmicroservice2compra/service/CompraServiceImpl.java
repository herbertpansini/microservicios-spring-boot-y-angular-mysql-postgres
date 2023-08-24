package com.vaxi.springbootmicroservice2compra.service;

import com.vaxi.springbootmicroservice2compra.model.Compra;
import com.vaxi.springbootmicroservice2compra.repository.CompraRepositroy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
//@Transactional
@RequiredArgsConstructor
public class CompraServiceImpl implements CompraService {

    private final CompraRepositroy compraRepositroy;

    @Override
    public Compra saveCompra(Compra compra) {
        compra.setFechaCompra(LocalDateTime.now());
        return this.compraRepositroy.save(compra);
    }

    @Override
//    @Transactional(readOnly = true)
    public List<Compra> findAllComprasOfUser(long userId) {
        return this.compraRepositroy.findAllByUserId(userId);
    }
}
