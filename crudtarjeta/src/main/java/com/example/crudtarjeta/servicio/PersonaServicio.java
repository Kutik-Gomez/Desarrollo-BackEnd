package com.example.crudtarjeta.servicio;

import com.example.crudtarjeta.modelo.Persona;
import com.example.crudtarjeta.repositorio.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServicio {
    @Autowired
    PersonaRepositorio personaRepositorio;
    public List<Persona> getPersona(){
        return personaRepositorio.findAll();
    }
    public Optional<Persona> getPersonaId(Long id){
        return personaRepositorio.findById(id);
    }

    public void guardarActualizar(Persona persona){
        personaRepositorio.save(persona);
    }
    public void eliminar(Long id){
        personaRepositorio.deleteById(id);
    }





}
