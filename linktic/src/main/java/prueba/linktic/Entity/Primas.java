package prueba.linktic.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "primas")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Primas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "edad_minima")
    private String edadMinima;

    @Column(name = "edad_maxima")
    private String edadMaxima;

    @Column(name = "porcentaje")
    private double porcentaje;

    @OneToOne
    @JoinColumn(name = "liquidacion_id")
    private Liquidacion liquidacion;
}
