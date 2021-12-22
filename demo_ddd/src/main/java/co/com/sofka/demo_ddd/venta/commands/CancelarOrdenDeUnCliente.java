package co.com.sofka.demo_ddd.venta.commands;

import co.com.sofka.demo_ddd.venta.Cliente;
import co.com.sofka.demo_ddd.venta.values.IdOrden;
import co.com.sofka.domain.generic.Command;

public class CancelarOrdenDeUnCliente extends Command {
    private final Cliente cliente;
    private final IdOrden idOrden;


    public CancelarOrdenDeUnCliente(Cliente cliente, IdOrden idOrden) {
        this.cliente = cliente;
        this.idOrden = idOrden;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public IdOrden getIdOrden() {
        return idOrden;
    }
}
