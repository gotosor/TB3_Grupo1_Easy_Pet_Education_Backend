package com.proyecto.mascotas.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "contacto") @Getter @Setter
public class Contacto {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contactoId;

    private String nombreCompleto;

    private String numeroCelular;

    private String correo;

    private String texto;
}
