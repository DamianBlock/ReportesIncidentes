package org.example;

import javax.persistence.Entity;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name="cliente")
public class Cliente {

    @Id
    @Column(name = "idCliente")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idCliente;

    @Column(name = "especialidad")
    private String especialidad;

    @Column(name ="email")
    private String email;

    @Column(name ="telefono")
    private double telefono;

    @Column(name ="nombre")
    private String nombre;

    @Column(name ="apellido")
    private String apellido;

    @Column(name ="Fecha_Nacimiento")
    private Date fechaNacimiento;


}
