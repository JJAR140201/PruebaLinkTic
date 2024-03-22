package prueba.linktic.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "liquidacion")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Liquidacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "valor_prima")
    private double valorPrima;

    @Column(name = "valor_poliza")
    private double valorPoliza;

    @OneToOne(mappedBy = "liquidacion", cascade = CascadeType.ALL)
    private Primas prima;

    @OneToOne
    @JoinColumn(name = "asegurado_id")
    private Asegurados asegurado;

    @OneToMany(mappedBy = "liquidacion", cascade = CascadeType.ALL)
    private List<Amparos> amparos;
}
