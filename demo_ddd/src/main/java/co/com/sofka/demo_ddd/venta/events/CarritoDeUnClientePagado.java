package co.com.sofka.demo_ddd.venta.events;

import co.com.sofka.demo_ddd.generico.DomainEvent;
import co.com.sofka.demo_ddd.venta.values.Precio;

public class CarritoDeUnClientePagado extends DomainEvent {
    private final Precio precio;

    protected CarritoDeUnClientePagado(Precio precio){
        super("PCSoluciones.venta.CarritoDeUnClientePagado");
        this.precio = precio;
    }

    public Precio getPrecio() {
        return precio;
    }
}
