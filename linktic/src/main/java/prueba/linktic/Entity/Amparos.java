package prueba.linktic.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "amparos")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Amparos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "codigo_amparo")
    private String codigoAmparo;

    @Column(name = "nombre_amparo")
    private String nombreAmparo;

    @ManyToOne
    @JoinColumn(name = "liquidacion_id")
    private Liquidacion liquidacion;
}
