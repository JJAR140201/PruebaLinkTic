package prueba.linktic.Service.IService;

import prueba.linktic.DTO.AseguradosDTO;
import prueba.linktic.DTO.LiquidacionDTO;

import java.util.List;

public interface IServiceAsegurados {
    List<AseguradosDTO> ListaAsegurados();
    List<LiquidacionDTO> listaLiquidacion();
}
