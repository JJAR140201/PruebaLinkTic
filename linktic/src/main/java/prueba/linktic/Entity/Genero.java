package prueba.linktic.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "genero")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "sexo")
    private String sexo;

    @ManyToOne
    @JoinColumn(name = "asegurado_id")
    private Asegurados asegurado;
}
