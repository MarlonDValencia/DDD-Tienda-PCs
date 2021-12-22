package co.com.sofka.demo_ddd.catalogo.events;

import co.com.sofka.demo_ddd.catalogo.Paquete;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class CatalogoActualizadoPaquetes extends DomainEvent {
    private final List<Paquete> ListaDePaquetes;

    public CatalogoActualizadoPaquetes(List<Paquete> ListaDePaquetes){
        super("PCSoluciones.venta.CatalogoActualizadoPaquetes");
        this.ListaDePaquetes = ListaDePaquetes;
    }

    public List<Paquete> getListaDePaquetes(){
        return this.ListaDePaquetes;
    }

}
