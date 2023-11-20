package org.example;
import javax.persistence.Entity;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name="operador")
public class Operador {

    @Id
    @Column(name = "idOPERADOR")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idOPERADOR;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name ="domicilio")
    private String domicilio;
    @Column(name ="telefono")
    private double telefono;



    @OneToMany
    @JoinColumn(name = "OPERADOR_idOPERADOR", referencedColumnName = "idOPERADOR")
    private Incidente incidentes;


}
