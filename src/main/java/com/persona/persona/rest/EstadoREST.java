package com.persona.persona.rest;

import com.persona.persona.model.Estado;
import com.persona.persona.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estados/")
public class EstadoREST {

    @Autowired
    private EstadoService estadoService;
   @GetMapping("{id}")
    private ResponseEntity<List<Estado>> getAllEstadosByPais(@PathVariable ("id") Long idPais){

        return ResponseEntity.ok(estadoService.findAllByCountry(idPais));


    }
}
