package com.example.crudtarjeta.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idPersona;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "cedula", unique = true, nullable = false)
    private String cedula;

    @Column(name = "correo")
    private String correo;

    @Column(name = "direccion")
    private String direccion;



}
