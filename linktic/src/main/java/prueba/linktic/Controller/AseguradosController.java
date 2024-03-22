package prueba.linktic.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prueba.linktic.DTO.AseguradosDTO;
import prueba.linktic.DTO.LiquidacionDTO;
import prueba.linktic.Service.IService.IServiceAsegurados;

import java.util.List;

@RestController
@RequestMapping("/asegurados")
public class AseguradosController {

    private final IServiceAsegurados service;

    @Autowired
    public AseguradosController(IServiceAsegurados service) {
        this.service = service;
    }

    @GetMapping("/listaAsegurados")
    public List<AseguradosDTO> listaAsegurados() {
        return service.ListaAsegurados();
    }

    @GetMapping("/listaLiquidacion")
    public List<LiquidacionDTO> listaLiquidacion() {return service.listaLiquidacion();}
}
