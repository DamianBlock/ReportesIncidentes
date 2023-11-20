package org.example;
import javax.persistence.Entity;
import javax.persistence.*;


@Entity
@Table(name="operador")
public class Operador {

    @Id
    @Column(name = "idOPERADOR")
    private int id;
    @Column(name = "nombre")
    private String nombre;


}
