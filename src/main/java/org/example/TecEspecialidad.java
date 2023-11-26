package org.example;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "especialidad")

public class TecEspecialidad {
    @Id
    @Column(name = "idEspecialidad")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Tec_Especialidades;

    @Column(name = "nombre_Epecialidad")
    private String nombreDeLaEspecialidad;

    @ManyToOne
    @JoinColumn (name= "Tecnicos_idTecnicos", referencedColumnName = "idTecnicos")
    private Tecnico tecnico;

}