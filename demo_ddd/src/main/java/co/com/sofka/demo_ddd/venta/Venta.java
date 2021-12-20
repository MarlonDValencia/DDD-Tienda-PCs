package co.com.sofka.demo_ddd.venta;

import co.com.sofka.demo_ddd.generico.AggregateRoot;
import co.com.sofka.demo_ddd.venta.values.*;

import java.util.List;

public class Venta extends AggregateRoot<IdVenta> {
    protected Cliente cliente;
    protected List<Producto> ListaDeProductos;
    protected Precio precio;
    public Venta(IdVenta IdVenta, Cliente cliente, List<Producto> ListaDeProductos, Precio precio){
        super(IdVenta);
    }
}
