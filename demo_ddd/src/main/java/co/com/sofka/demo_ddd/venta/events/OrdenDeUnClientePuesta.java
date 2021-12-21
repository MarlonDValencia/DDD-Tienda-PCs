package co.com.sofka.demo_ddd.venta.events;

import co.com.sofka.demo_ddd.generico.DomainEvent;
import co.com.sofka.demo_ddd.venta.values.IdOrden;
import co.com.sofka.demo_ddd.venta.values.IdProducto;

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
