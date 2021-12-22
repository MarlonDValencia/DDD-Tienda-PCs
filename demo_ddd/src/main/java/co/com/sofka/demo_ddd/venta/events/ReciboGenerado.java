package co.com.sofka.demo_ddd.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.demo_ddd.venta.values.IdCliente;
import co.com.sofka.demo_ddd.venta.values.Precio;

import java.util.Objects;

public class ReciboGenerado extends DomainEvent {
    private IdCliente idCliente;
    private Precio precio;
    public ReciboGenerado(IdCliente idCliente, Precio precio) {
            super("PCSoluciones.venta.ReciboGenerado");
            this.precio = Objects.requireNonNull(precio);
            this.idCliente = Objects.requireNonNull(idCliente);
    }

    public IdCliente getIdCliente() {
        return idCliente;
    }

    public Precio getPrecio() {
        return precio;
    }
}
