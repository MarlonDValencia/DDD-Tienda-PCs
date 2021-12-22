package co.com.sofka.demo_ddd.catalogo.commands;

import co.com.sofka.demo_ddd.catalogo.values.IdArticulo;
import co.com.sofka.domain.generic.Command;

public class EliminarUnArticulo extends Command {
    private final IdArticulo idArticulo;

    public EliminarUnArticulo(IdArticulo idArticulo) {
        this.idArticulo = idArticulo;
    }

    public IdArticulo getIdArticulo() {
        return idArticulo;
    }
}
