package co.com.sofka.demo_ddd.trabajador;

import co.com.sofka.demo_ddd.generico.AggregateRoot;
import co.com.sofka.demo_ddd.trabajador.events.OrdenTomada;
import co.com.sofka.demo_ddd.trabajador.values.IdTrabajador;
import co.com.sofka.demo_ddd.trabajador.values.Rol;
import co.com.sofka.demo_ddd.venta.Orden;
import co.com.sofka.demo_ddd.venta.events.OrdenDeUnClienteCancelada;
import co.com.sofka.demo_ddd.venta.values.*;

import java.util.Objects;

public class Trabajador extends AggregateRoot<IdTrabajador> {

    private final Nombre nombre;
    private final Rol rol;
    private final Orden orden;

    public Trabajador(IdTrabajador idTrabajador, Nombre nombre, Rol rol, Orden orden) {
        super(idTrabajador);
        this.nombre = Objects.requireNonNull(nombre);
        this.rol = Objects.requireNonNull(rol);
        this.orden = Objects.requireNonNull(orden);
    }

    public void TomarOrden(Orden orden){
        var id = orden.getId();
        this.applyChange(new OrdenTomada(id));
    }

    public void CerrarUnaOrden(Orden orden){
        var id = orden.getId();
        orden.cerrarOrden();
        this.applyChange(new OrdenDeUnClienteCancelada(id));
    }
}
