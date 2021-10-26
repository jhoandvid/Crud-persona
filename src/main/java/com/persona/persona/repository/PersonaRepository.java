package com.persona.persona.repository;

import com.persona.persona.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository <Persona, Long> {
}
