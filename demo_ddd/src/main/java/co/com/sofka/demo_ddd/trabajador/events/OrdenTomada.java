package co.com.sofka.demo_ddd.trabajador.events;

import co.com.sofka.demo_ddd.generico.DomainEvent;
import co.com.sofka.demo_ddd.venta.values.IdOrden;

import java.util.Objects;

public class OrdenTomada extends DomainEvent {
    private IdOrden idOrden;
    public OrdenTomada(IdOrden idOrden){
        super("PCSoluciones.venta.OrdenTomada");
        this.idOrden = Objects.requireNonNull(idOrden);
    }

    public IdOrden getIdOrden(){
        return this.idOrden;
    }
}
