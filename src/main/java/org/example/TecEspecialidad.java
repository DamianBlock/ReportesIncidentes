package org.example;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Tec_Especialidades")

public class TecEspecialidad {
    @Id
    @Column(name = "idTec_Especialidades")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Tec_Especialidades;

    @Column(name = "Tipo/Nombre")
    private String nombreDeLaEspecialidad;

    @ManyToOne
    @JoinColumn (name= "Tecnicos_idTecnicos", referencedColumnName = "idTecnicos")
    private Tecnico tecnico;

}