package com.vaxi.springbootmicroservice1inmueble.repository;

import com.vaxi.springbootmicroservice1inmueble.model.Inmueble;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InmuebleRepository extends JpaRepository<Inmueble, Long> {
}