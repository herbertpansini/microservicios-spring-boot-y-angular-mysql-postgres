package com.vaxi.springbootmicroservice1inmueble.service;

import com.vaxi.springbootmicroservice1inmueble.model.Inmueble;

import java.util.List;

public interface InmuebleService {
    Inmueble saveInmueble(Inmueble inmueble);

    void deleteInmueble(long inmuebleId);

    List<Inmueble> findAllInmuebles();
}
