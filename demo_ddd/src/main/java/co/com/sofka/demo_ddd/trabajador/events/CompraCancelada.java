package co.com.sofka.demo_ddd.trabajador.events;

import co.com.sofka.demo_ddd.venta.values.IdOrden;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Objects;

public class CompraCancelada extends DomainEvent {
    private IdOrden idOrden;
    public CompraCancelada(IdOrden idOrden){
        super("PCSoluciones.venta.CompraCancelada");
        this.idOrden = Objects.requireNonNull(idOrden);
    }

    public IdOrden getIdOrden(){
        return this.idOrden;
    }
}
