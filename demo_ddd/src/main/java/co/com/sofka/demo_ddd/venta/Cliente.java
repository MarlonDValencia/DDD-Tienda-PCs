package co.com.sofka.demo_ddd.venta;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.demo_ddd.venta.values.IdCliente;
import co.com.sofka.demo_ddd.venta.values.IdOrden;

import java.util.List;
import java.util.Objects;

public class Cliente extends Entity<IdCliente> {
    private final String nombre;
    private final String email;
    public List<Orden> ListaDeOrdenes;
    private final String cedula;


    public Cliente(IdCliente idCliente, String nombre, String email, List<Orden> listaDeOrdenes, String cedula) {
        super(idCliente);
        this.nombre = Objects.requireNonNull(nombre);
        this.email = Objects.requireNonNull(email);
        ListaDeOrdenes = Objects.requireNonNull(listaDeOrdenes);
        this.cedula = Objects.requireNonNull(cedula);
    }

    public void PonerOrden(Orden orden){
        this.ListaDeOrdenes.add(orden);
    }

    public void CancelarOrden(IdOrden idOrden){
        this.ListaDeOrdenes.removeIf(item -> item.identity().equals(idOrden));
    }

    public String nombre() {
        return nombre;
    }

    public String email() {
        return email;
    }

    public List<Orden> listaDeOrdenes() {
        return ListaDeOrdenes;
    }

    public String cedula() {
        return cedula;
    }
}
