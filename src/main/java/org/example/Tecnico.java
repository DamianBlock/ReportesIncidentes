package org.example;

import javax.persistence.Entity;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name="operador")
public class Tecnico {

    @Id
    @Column(name = "idTECNICO")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idTecnico;

    @Column(name = "cuit")
    private double cuit;
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name ="domicilio")
    private String domicilio;
    @Column(name ="telefono")
    private double telefono;

    @Column(name ="fecha_alta")
    private LocalDate fechaAlta;
    @Column(name ="fecha_baja")
    private LocalDate fechaBaja;


    @OneToMany
    @JoinColumn(name = "OPERADOR_idOPERADOR", referencedColumnName = "idOPERADOR")
    private Incidente incidentes;


}
