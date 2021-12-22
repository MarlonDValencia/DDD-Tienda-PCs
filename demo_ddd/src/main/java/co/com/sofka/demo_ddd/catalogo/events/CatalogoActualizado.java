package co.com.sofka.demo_ddd.catalogo.events;

import co.com.sofka.demo_ddd.catalogo.Articulo;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class CatalogoActualizado extends DomainEvent {
    private final List<Articulo> ListaDeArticulos;

    public CatalogoActualizado(List<Articulo> ListaDeArticulos){
        super("PCSoluciones.venta.CatalogoActualizado");
        this.ListaDeArticulos = ListaDeArticulos;
    }

    public List<Articulo> getListaDeArticulos(){
        return this.ListaDeArticulos;
    }

}
