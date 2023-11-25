package org.example;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RRHH")
public class RRHH {

    @Id
    @Column(name = "idRRHH")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idRRHH;

    @OneToOne
    @JoinColumn(name="Tecnicos_idTecnicos", referencedColumnName = "idTecnicos")
    private Tecnico RefTecnico;

}
