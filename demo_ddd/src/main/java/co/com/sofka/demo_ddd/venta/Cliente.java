package co.com.sofka.demo_ddd.venta;

import co.com.sofka.demo_ddd.generico.Entity;
import co.com.sofka.demo_ddd.generico.Id;
import co.com.sofka.demo_ddd.venta.events.OrdenDeUnClienteCancelada;
import co.com.sofka.demo_ddd.venta.values.IdOrden;

import java.util.List;
import java.util.Objects;

public class Cliente extends Entity {
    private final String nombre;
    private final String email;
    public List<Orden> ListaDeOrdenes;
    private final String cedula;


    public Cliente(Id id, String nombre, String email, List<Orden> listaDeOrdenes, String cedula) {
        super(id);
        this.nombre = Objects.requireNonNull(nombre);
        this.email = Objects.requireNonNull(email);
        ListaDeOrdenes = Objects.requireNonNull(listaDeOrdenes);
        this.cedula = Objects.requireNonNull(cedula);
    }

    public void PonerOrden(Orden orden){
        this.ListaDeOrdenes.add(orden);
    }

    public void CancelarOrden(IdOrden idOrden){
        this.ListaDeOrdenes.removeIf(item -> item.getId().equals(idOrden));
    }
}
