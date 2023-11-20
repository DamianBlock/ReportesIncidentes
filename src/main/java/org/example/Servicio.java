package org.example;
import javax.persistence.Entity;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;

@Data
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name="servicio")
public class Servicio {
    @Id
    @Column(name = "idServicio")
    @GeneratedValue (strategy= GenerationType.IDENTITY)

    private int idServicio;
}
