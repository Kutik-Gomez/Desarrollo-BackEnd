package com.example.crudtarjeta.controlador;

import com.example.crudtarjeta.modelo.Persona;
import com.example.crudtarjeta.servicio.PersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/persona")
public class PersonaControlador {
    @Autowired
    private PersonaServicio personaServicio;
    @GetMapping
    public List<Persona> getTodo(){
        return  personaServicio.getPersona();
    }
    @PostMapping
    public Persona guardar(@RequestBody Persona persona){
        personaServicio.guardarActualizar(persona);
        return persona;
    }

    @DeleteMapping("/{idpersona}")
    public  void eliminar(@PathVariable("idpersona") long id){
        personaServicio.eliminar(id);
    }

    //Codigo de consulta por ID
    @GetMapping("/{idpersona}")
    public Optional<Persona> consultaPorId(@PathVariable("idpersona") Long id){
        return personaServicio.getPersonaId(id);
    }

}
