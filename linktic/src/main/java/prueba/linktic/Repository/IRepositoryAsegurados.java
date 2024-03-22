package prueba.linktic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import prueba.linktic.DTO.AseguradosDTO;
import prueba.linktic.DTO.LiquidacionDTO;
import prueba.linktic.Entity.Asegurados;

import java.util.List;

@Repository
public interface IRepositoryAsegurados extends JpaRepository<Asegurados, Long> {
    @Query(value = "SELECT " +
            "i.tipo_identificacion AS tipoIdentificacion," +
            " a.numero_identificacion AS numeroIdentificacion," +
            " a.valor_asegurado AS valorAsegurado\n" +
            "FROM asegurados a\n" +
            "JOIN identificacion i ON a.id = i.asegurado_id;\n", nativeQuery = true)
    List<AseguradosDTO> ListaAsegurados();

    @Query(value = "SELECT\n" +
            "    i.tipo_identificacion AS tipoIdentificacion,\n" +
            "    a.numero_identificacion AS numeroIdentificacion,\n" +
            "    a.valor_asegurado AS valorAsegurado,\n" +
            "    am.codigo_amparo AS codigoAmparo,\n" +
            "    am.nombre_amparo AS nombreAmparo,\n" +
            "    l.valor_prima AS valorPrima,\n" +
            "    a.valor_total AS valorTotal\n" +
            "FROM\n" +
            "    Asegurados a\n" +
            "INNER JOIN\n" +
            "    Identificacion i ON a.id = i.asegurado_id\n" +
            "INNER JOIN\n" +
            "    Liquidacion l ON a.id = l.asegurado_id\n" +
            "LEFT JOIN\n" +
            "    Amparos am ON l.id = am.liquidacion_id\n" +
            "LIMIT 0, 1000;\n", nativeQuery = true)
    List<LiquidacionDTO> listaLiquidacion();
}
