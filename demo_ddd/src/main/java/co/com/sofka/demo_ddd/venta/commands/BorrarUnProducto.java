package co.com.sofka.demo_ddd.venta.commands;

import co.com.sofka.demo_ddd.venta.values.IdProducto;
import co.com.sofka.domain.generic.Command;

public class BorrarUnProducto extends Command {
    private final IdProducto idProducto;

    public BorrarUnProducto(IdProducto idProducto) {
        this.idProducto = idProducto;
    }

    public IdProducto getIdProducto() {
        return idProducto;
    }
}
