package com.example.chancay.model;

import jakarta.persistence.*;

@Entity
@Table(name = "embarcacion")
public class Embarcacion {

    //Cracion de la clave primaria id auto_incremental
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //Columna nombre de la embarcacion
    @Column(name = "nombre")
    private String nombre;

    //Columna capacidad de la embarcacion
    @Column(name = "capacidad")
    private double capacidad;

    //Columna descripcion de la embarcacion
    @Column(length = 250, nullable = true)
    private String descripcion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
}
