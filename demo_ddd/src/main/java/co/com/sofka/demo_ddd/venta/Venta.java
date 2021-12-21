package co.com.sofka.demo_ddd.venta;

import co.com.sofka.demo_ddd.catalogo.Articulo;
import co.com.sofka.demo_ddd.generico.AggregateRoot;
import co.com.sofka.demo_ddd.venta.events.*;
import co.com.sofka.demo_ddd.venta.values.*;

import java.util.List;
import java.util.Objects;

public class Venta extends AggregateRoot<IdVenta> {

    private final IdCliente IdCliente;
    private final List<Producto> ListaDeProductos;
    private final Precio precio;

    public Venta(IdVenta IdVenta, IdCliente Idcliente, List<Producto> ListaDeProductos, Precio precio){
        super(IdVenta);
        this.IdCliente = Objects.requireNonNull(Idcliente);
        this.ListaDeProductos = ListaDeProductos;
        this.precio = Objects.requireNonNull(precio);
    }

    public void GenerarRecibo(){
        this.applyChange(new ReciboGenerado(IdCliente,precio));
    }

    public void EditarPrecioDeUnProducto(IdProducto idProducto,Precio precio){
        ListaDeProductos.forEach(item ->{
            item.editarPrecio(precio);
            this.applyChange(new PrecioDeProductoEditado(idProducto, precio));
        });
    }

    public void BorrarUnProducto(IdProducto idProducto){
        ListaDeProductos.removeIf(item -> item.getId().equals(idProducto));
        this.applyChange(new ProductoBorrado(idProducto));
    }

    public void AgregarUnProducto(IdProducto idProducto, Precio precio,InfoFabricante infoFabricante, Recibo recibo){
        var id = new IdProducto();
        ListaDeProductos.add(new Producto(id,precio,infoFabricante,recibo));
        this.applyChange(new ProductoAgregado(id,precio,infoFabricante,recibo));
    }

    public void PonerOrdenDeUnCliente(Cliente cliente, Orden orden){
        cliente.ListaDeOrdenes.add(orden);
        this.applyChange(new OrdenDeUnClientePuesta(orden.getId()));
    }

    public void CancelarOrdenDeUnCliente(Cliente cliente, IdOrden idOrden){
        cliente.ListaDeOrdenes.removeIf(item -> item.getId().equals(idOrden));
        this.applyChange(new OrdenDeUnClienteCancelada(idOrden));
    }
}
