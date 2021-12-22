package co.com.sofka.demo_ddd.venta.events;

import co.com.sofka.domain.generic.*;
import co.com.sofka.demo_ddd.venta.values.IdProducto;
import co.com.sofka.demo_ddd.venta.values.Precio;

public class PrecioDeProductoEditado extends DomainEvent {
    private final IdProducto idProducto;
    private final Precio precio;
    public PrecioDeProductoEditado(IdProducto idProducto, Precio precio) {
        super("PCSoluciones.venta.ReciboGenerado");
        this.idProducto = idProducto;
        this.precio = precio;
    }

}
