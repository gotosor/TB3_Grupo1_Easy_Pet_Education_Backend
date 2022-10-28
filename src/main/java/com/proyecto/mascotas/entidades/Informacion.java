package com.proyecto.mascotas.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "informacion") @Getter @Setter
public class Informacion {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long informacionId;
    
    private String ruta;

    private String claseImagen;

    private String columna;

    private String subcol;

    private String texto;
}
