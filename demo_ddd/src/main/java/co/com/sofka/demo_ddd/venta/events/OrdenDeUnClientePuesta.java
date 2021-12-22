package co.com.sofka.demo_ddd.venta.events;

import co.com.sofka.domain.generic.*;
import co.com.sofka.demo_ddd.venta.values.IdOrden;

public class OrdenDeUnClientePuesta extends DomainEvent {
    private IdOrden idOrden;

    public OrdenDeUnClientePuesta(IdOrden idOrden) {
        super("PCSoluciones.venta.OrdenDeUnClientePuesta");
        this.idOrden = idOrden;
    }

    public IdOrden getidOrden() {
        return idOrden;
    }
}
