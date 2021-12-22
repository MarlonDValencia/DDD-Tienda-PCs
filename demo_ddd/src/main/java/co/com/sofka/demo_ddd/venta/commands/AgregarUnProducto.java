package co.com.sofka.demo_ddd.venta.commands;

import co.com.sofka.demo_ddd.venta.values.IdProducto;
import co.com.sofka.demo_ddd.venta.values.InfoFabricante;
import co.com.sofka.demo_ddd.venta.values.Precio;
import co.com.sofka.demo_ddd.venta.values.Recibo;
import co.com.sofka.domain.generic.Command;

public class AgregarUnProducto extends Command {
    private final IdProducto idProducto;
    private final Precio precio;
    private final InfoFabricante infoFabricante;
    private final Recibo recibo;

    public AgregarUnProducto(IdProducto idProducto, Precio precio, InfoFabricante infoFabricante, Recibo recibo) {
        this.idProducto = idProducto;
        this.precio = precio;
        this.infoFabricante = infoFabricante;
        this.recibo = recibo;
    }

    public IdProducto getIdProducto() {
        return idProducto;
    }

    public Precio getPrecio() {
        return precio;
    }

    public InfoFabricante getInfoFabricante() {
        return infoFabricante;
    }

    public Recibo getRecibo() {
        return recibo;
    }
}
