package co.com.sofka.demo_ddd.catalogo.events;

import co.com.sofka.demo_ddd.catalogo.values.IdArticulo;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Objects;

public class ArticuloSeleccionado extends DomainEvent {

    private final IdArticulo idArticulo;

    public ArticuloSeleccionado(IdArticulo idArticulo){
        super("PCSoluciones.venta.ArticuloSeleccionado");
        this.idArticulo = Objects.requireNonNull(idArticulo);
    }

    public IdArticulo getIdArticulo(){
        return this.idArticulo;
    }
}
