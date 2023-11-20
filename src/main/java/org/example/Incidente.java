package org.example;
import javax.persistence.Entity;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name="incidente")
public class Incidente {
    @Id
    @Column(name = "idIncidente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIncidente;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "estado")
    private String estado;

    @Column(name = "fecha_de_Inicio")
    private LocalDate fechaInicio;

    @Column(name = "fecha_de_resolucion_estimada")
    private Date fechaResolucionEstimada;

    @ManyToOne
    @JoinColumn(name = "OPERADOR_idOPERADOR", referencedColumnName = "idOPERADOR")
    private Operador operador;

    @ManyToOne
    @JoinColumn(name = "CLIENTE_idCliente", referencedColumnName = "idCliente")
    private Cliente cliente;

}
