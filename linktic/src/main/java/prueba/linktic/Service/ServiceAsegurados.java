package prueba.linktic.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prueba.linktic.DTO.AseguradosDTO;
import prueba.linktic.DTO.LiquidacionDTO;
import prueba.linktic.Repository.IRepositoryAsegurados;
import prueba.linktic.Service.IService.IServiceAsegurados;

import java.util.List;

@Service
public class ServiceAsegurados implements IServiceAsegurados {

    private IRepositoryAsegurados repository;

    @Autowired
    public ServiceAsegurados(IRepositoryAsegurados repository){
        this.repository = repository;
    }

    @Override
    public List<AseguradosDTO> ListaAsegurados() {
        return repository.ListaAsegurados();
    }

    @Override
    public List<LiquidacionDTO> listaLiquidacion() {
        return repository.listaLiquidacion();
    }
}
