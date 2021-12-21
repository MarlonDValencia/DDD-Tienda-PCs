package co.com.sofka.demo_ddd.catalogo.events;

import co.com.sofka.demo_ddd.catalogo.values.IdArticulo;
import co.com.sofka.demo_ddd.generico.DomainEvent;

import java.util.Objects;

public class StockDeUnArticuloVaciado extends DomainEvent{
    private final IdArticulo idArticulo;

    public StockDeUnArticuloVaciado(IdArticulo idArticulo){
        super("PCSoluciones.venta.StockDeUnArticuloVaciado");
        this.idArticulo = Objects.requireNonNull(idArticulo);
    }


    public IdArticulo getIdArticulo(){
        return this.idArticulo;
    }
}
