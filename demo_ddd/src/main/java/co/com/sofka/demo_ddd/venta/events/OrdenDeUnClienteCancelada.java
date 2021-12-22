package co.com.sofka.demo_ddd.venta.events;

import co.com.sofka.domain.generic.*;
import co.com.sofka.demo_ddd.venta.values.IdOrden;

import java.util.Objects;

public class OrdenDeUnClienteCancelada extends DomainEvent {
    private final IdOrden idOrden;
    public OrdenDeUnClienteCancelada(IdOrden idOrden){
        super("PCSoluciones.venta.OrdenDeUnClienteCancelada");
        this.idOrden = Objects.requireNonNull(idOrden);
    }

    public IdOrden getIdOrden(){
        return this.idOrden;
    }
}
