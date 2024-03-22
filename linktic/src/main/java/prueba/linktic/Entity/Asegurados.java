package prueba.linktic.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "asegurados")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Asegurados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "numero_identificacion")
    private String numeroIdentificacion;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "valor_asegurado")
    private double valorAsegurado;

    @Column(name = "valor_total")
    private double valorTotal;

    @OneToMany(mappedBy = "asegurado", cascade = CascadeType.ALL)
    private List<Genero> generos;

    @OneToMany(mappedBy = "asegurado", cascade = CascadeType.ALL)
    private List<Identificacion> identificaciones;

    @OneToOne(mappedBy = "asegurado", cascade = CascadeType.ALL)
    private Liquidacion liquidacion;
}
