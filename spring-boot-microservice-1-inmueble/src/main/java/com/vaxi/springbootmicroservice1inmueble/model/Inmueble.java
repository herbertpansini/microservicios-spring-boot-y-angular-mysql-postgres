package com.vaxi.springbootmicroservice1inmueble.model;

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
@Table(name = "inmueble")
public class Inmueble implements Serializable {
    static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "nombre", length = 150, nullable = false)
    String nombre;

    @Column(name = "direccion", length = 150, nullable = false)
    String direccion;

    @Column(name = "picture", length = 1200)
    String picture;

    @Column(name = "precio", nullable = false)
    Double precio;

    @Column(name = "fechaCreacion", nullable = false)
    LocalDateTime fechaCreacion;
}