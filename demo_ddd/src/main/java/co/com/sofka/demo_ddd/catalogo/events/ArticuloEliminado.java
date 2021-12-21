package co.com.sofka.demo_ddd.catalogo.events;

import co.com.sofka.demo_ddd.catalogo.values.IdArticulo;
import co.com.sofka.demo_ddd.generico.DomainEvent;

import java.util.Objects;

public class ArticuloEliminado extends DomainEvent {
    private final IdArticulo idArticulo;

    public ArticuloEliminado(IdArticulo idArticulo){
        super("PCSoluciones.venta.ArticuloEliminado");
        this.idArticulo = Objects.requireNonNull(idArticulo);
    }

    public IdArticulo getIdArticulo(){
        return this.idArticulo;
    }
}
