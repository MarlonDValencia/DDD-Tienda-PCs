package co.com.sofka.demo_ddd.trabajador.commands;

import co.com.sofka.demo_ddd.venta.Orden;
import co.com.sofka.domain.generic.Command;

public class CerrarUnaOrden extends Command {
    private final Orden orden;

    public CerrarUnaOrden(Orden orden) {
        this.orden = orden;
    }

    public Orden getOrden() {
        return orden;
    }
}
