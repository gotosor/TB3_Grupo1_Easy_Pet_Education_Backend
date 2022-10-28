package com.proyecto.mascotas.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "mascota") @Getter @Setter
public class Mascota {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mascotaId;

    private String nombre;

    private String carpeta;

    private String imagenCmb;

    private String imagenAli;

    private String  imagenHig;

    private String  imagenAmb;

    private String  imagenRep;

    private String textoAli;

    private String  textoHig;

    private String textoAmb;

    private String  textoRep;

    private String  videoIzq;

    private String  videoCent;

    private String  videoDere;

}
