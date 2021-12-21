package co.com.sofka.demo_ddd.catalogo.events;

import co.com.sofka.demo_ddd.catalogo.Articulo;
import co.com.sofka.demo_ddd.catalogo.Paquete;
import co.com.sofka.demo_ddd.generico.DomainEvent;
import co.com.sofka.demo_ddd.generico.Entity;

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
