package com.persona.persona.rest;

import com.persona.persona.model.Persona;
import com.persona.persona.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/personas/")
public class PersonaREST {
    @Autowired
private PersonaService personaService;

    @GetMapping
    private ResponseEntity<List<Persona>>getAllPersonas(){

        return ResponseEntity.ok(personaService.findAll());
    }
    @PostMapping
private ResponseEntity<Persona> savePersona (@RequestBody Persona persona){
 try {
     Persona personaGuardada=personaService.save(persona);
     return ResponseEntity.created(new URI ("/personas/"+personaGuardada.getId())).body(personaGuardada);
 }catch (Exception e){
     return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
 }

}
}
