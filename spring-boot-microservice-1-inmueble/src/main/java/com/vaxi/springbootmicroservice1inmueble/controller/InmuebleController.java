package com.vaxi.springbootmicroservice1inmueble.controller;

import com.vaxi.springbootmicroservice1inmueble.model.Inmueble;
import com.vaxi.springbootmicroservice1inmueble.service.InmuebleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/inmueble")
@RequiredArgsConstructor
public class InmuebleController {
    private final InmuebleService inmuebleService;

    @PostMapping
    public ResponseEntity<?> saveInmueble(@RequestBody Inmueble inmueble) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.inmuebleService.saveInmueble(inmueble));
    }

    @DeleteMapping("{inmuebleId}")
    public ResponseEntity<?> deleteInmueble(@PathVariable long inmuebleId) {
        this.inmuebleService.deleteInmueble(inmuebleId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<?> findAllInmuebles() {
        return ResponseEntity.ok(this.inmuebleService.findAllInmuebles());
    }
}