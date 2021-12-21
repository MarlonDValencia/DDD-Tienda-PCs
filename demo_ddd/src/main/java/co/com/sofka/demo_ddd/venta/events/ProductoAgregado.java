package co.com.sofka.demo_ddd.venta.events;

import co.com.sofka.demo_ddd.generico.DomainEvent;
import co.com.sofka.demo_ddd.venta.values.*;

public class ProductoAgregado extends DomainEvent {
    private final IdProducto idProducto;
    private final Precio precio;
    private final InfoFabricante infoFabricante;
    private final Recibo recibo;

    public ProductoAgregado(IdProducto idProducto, Precio precio, InfoFabricante infoFabricante, Recibo recibo) {
        super("PCSoluciones.venta.ProductoAgregado");
        this.idProducto = idProducto;
        this.precio = precio;
        this.infoFabricante = infoFabricante;
        this.recibo = recibo;
    }

    public IdProducto getIdProducto() {
        return idProducto;
    }

}
