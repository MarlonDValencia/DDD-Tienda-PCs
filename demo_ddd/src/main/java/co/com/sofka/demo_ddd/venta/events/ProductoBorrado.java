package co.com.sofka.demo_ddd.venta.events;

import co.com.sofka.domain.generic.*;
import co.com.sofka.demo_ddd.venta.values.IdProducto;

import java.util.Objects;

public class ProductoBorrado extends DomainEvent {
    private IdProducto idProducto;

    public ProductoBorrado(IdProducto idProducto) {
        super("PCSoluciones.venta.ProductoBorrado");
        this.idProducto = Objects.requireNonNull(idProducto);
    }

    public IdProducto getIdProducto() {
        return idProducto;
    }

}
