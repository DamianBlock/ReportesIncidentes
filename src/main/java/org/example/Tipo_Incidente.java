package org.example;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name = "TipoIncidente")
public class Tipo_Incidente {

    @Id
    @Column(name = "idTipo_Incidente")
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private int idTipo_Incidente;

    @Column(name = "Tipo/Nombre")
    private String tipo_nombre;





}
