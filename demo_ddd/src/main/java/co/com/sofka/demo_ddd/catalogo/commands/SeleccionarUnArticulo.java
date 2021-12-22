package co.com.sofka.demo_ddd.catalogo.commands;

import co.com.sofka.demo_ddd.catalogo.values.IdArticulo;
import co.com.sofka.domain.generic.Command;

public class SeleccionarUnArticulo extends Command {
    private final IdArticulo idArticulo;

    public SeleccionarUnArticulo(IdArticulo idArticulo) {
        this.idArticulo = idArticulo;
    }

    public IdArticulo getIdArticulo() {
        return idArticulo;
    }
}
