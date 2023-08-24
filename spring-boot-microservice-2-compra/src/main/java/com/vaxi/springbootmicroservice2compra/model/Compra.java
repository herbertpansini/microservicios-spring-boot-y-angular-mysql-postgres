package com.vaxi.springbootmicroservice2compra.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "compra")
public class Compra implements Serializable {
    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "user_id", nullable = false)
    Long userId;

    @Column(name = "inmueble_id", nullable = false)
    Long inmuebleId;

    @Column(name = "titulo", nullable = false)
    String titulo;

    @Column(name = "precio", nullable = false)
    Double precio;

    @Column(name = "fecha_compra", nullable = false)
    LocalDateTime fechaCompra;
}
