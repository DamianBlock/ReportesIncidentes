package org.example;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.Operador;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Area_Comercial")
public class AreaComercial {

    @Id
    @Column(name = "idArea_Comercial")
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private int idArea_Comercial;

    @ManyToOne
    @JoinColumn(name= "Operador_idOperador", referencedColumnName = "IdOperador")
    private Operador refOperador;

    @OneToMany (mappedBy = "Clientes")
    private Cliente refCliente;
}
