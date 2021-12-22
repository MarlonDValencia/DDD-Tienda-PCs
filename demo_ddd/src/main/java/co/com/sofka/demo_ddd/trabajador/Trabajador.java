package co.com.sofka.demo_ddd.trabajador;

import co.com.sofka.domain.generic.*;
import co.com.sofka.demo_ddd.trabajador.events.OrdenTomada;
import co.com.sofka.demo_ddd.trabajador.values.IdTrabajador;
import co.com.sofka.demo_ddd.trabajador.values.Rol;
import co.com.sofka.demo_ddd.venta.Orden;
import co.com.sofka.demo_ddd.venta.events.OrdenDeUnClienteCancelada;
import co.com.sofka.demo_ddd.venta.values.*;

import java.util.Objects;

public class Trabajador extends AggregateEvent<IdTrabajador> {

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
        var id = orden.identity();
        appendChange(new OrdenTomada(id)).apply();
    }

    public void CerrarUnaOrden(Orden orden){
        var id = orden.identity();
        orden.cerrarOrden();
        appendChange(new OrdenDeUnClienteCancelada(id)).apply();
    }

    public Nombre nombre() {
        return nombre;
    }

    public Rol rol() {
        return rol;
    }

    public Orden orden() {
        return orden;
    }
}
