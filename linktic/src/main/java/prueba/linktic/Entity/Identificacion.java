package prueba.linktic.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "identificacion")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Identificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "tipo_identificacion")
    private String tipoIdentificacion;

    @ManyToOne
    @JoinColumn(name = "asegurado_id")
    private Asegurados asegurado;
}
