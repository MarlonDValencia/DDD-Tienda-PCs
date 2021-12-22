package co.com.sofka.demo_ddd.catalogo.events;

import co.com.sofka.demo_ddd.catalogo.values.IdArticulo;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Objects;

public class StockDeUnArticuloConsultado extends DomainEvent {
    private final IdArticulo idArticulo;

    public StockDeUnArticuloConsultado(IdArticulo idArticulo){
        super("PCSoluciones.venta.StockDeUnArticuloConsultado");
        this.idArticulo = Objects.requireNonNull(idArticulo);
    }


    public IdArticulo getIdArticulo(){
        return this.idArticulo;
    }
}
