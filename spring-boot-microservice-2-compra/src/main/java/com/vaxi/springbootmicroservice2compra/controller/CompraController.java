package com.vaxi.springbootmicroservice2compra.controller;

import com.vaxi.springbootmicroservice2compra.model.Compra;
import com.vaxi.springbootmicroservice2compra.service.CompraService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/compra")
@RequiredArgsConstructor
public class CompraController {
    private final CompraService compraService;

    @PostMapping
    public ResponseEntity<?> saveCompra(@RequestBody Compra compra) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.compraService.saveCompra(compra));
    }

    @GetMapping("{userId}")
    public ResponseEntity<?> getAllComprasOfUser(@PathVariable long userId) {
        return ResponseEntity.ok(this.compraService.findAllComprasOfUser(userId));
    }
}