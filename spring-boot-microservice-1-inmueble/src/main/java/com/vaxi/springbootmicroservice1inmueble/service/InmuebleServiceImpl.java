package com.vaxi.springbootmicroservice1inmueble.service;

import com.vaxi.springbootmicroservice1inmueble.model.Inmueble;
import com.vaxi.springbootmicroservice1inmueble.repository.InmuebleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class InmuebleServiceImpl implements InmuebleService {
    private final InmuebleRepository inmuebleRepository;

    @Override
    public Inmueble saveInmueble(Inmueble inmueble) {
        inmueble.setFechaCreacion(LocalDateTime.now());

        return this.inmuebleRepository.save(inmueble);
    }

    @Override
    public void deleteInmueble(long inmuebleId) {
        this.inmuebleRepository.deleteById(inmuebleId);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Inmueble> findAllInmuebles() {
        return this.inmuebleRepository.findAll();
    }
}
