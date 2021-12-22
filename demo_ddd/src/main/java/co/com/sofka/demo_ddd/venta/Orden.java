package co.com.sofka.demo_ddd.venta;

import co.com.sofka.demo_ddd.catalogo.Articulo;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.demo_ddd.venta.values.*;

import java.util.List;
import java.util.Objects;

public class Orden extends Entity<IdOrden> {

    private final List<Articulo> ListaArticulos;
    private final Precio precio;
    private EstadoOrden estadoOrden;

    public Orden(IdOrden idOrden,List<Articulo> ListaArticulos,Precio precio, EstadoOrden estadoOrden) {
        super(idOrden);
        this.ListaArticulos = ListaArticulos;
        this.precio = Objects.requireNonNull(precio);
        this.estadoOrden =  Objects.requireNonNull(estadoOrden);
    }

    public void cerrarOrden(){
        this.estadoOrden.state = "Closed";
    }

    public List<Articulo> listaArticulos() {
        return ListaArticulos;
    }

    public Precio precio() {
        return precio;
    }

    public EstadoOrden estadoOrden() {
        return estadoOrden;
    }
}
