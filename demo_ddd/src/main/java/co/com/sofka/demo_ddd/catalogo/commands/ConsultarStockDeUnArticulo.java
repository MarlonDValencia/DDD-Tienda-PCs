package co.com.sofka.demo_ddd.catalogo.commands;

import co.com.sofka.demo_ddd.catalogo.values.IdArticulo;
import co.com.sofka.domain.generic.Command;

public class ConsultarStockDeUnArticulo extends Command {
    private final IdArticulo idArticulo;

    public ConsultarStockDeUnArticulo(IdArticulo idArticulo) {
        this.idArticulo = idArticulo;
    }

    public IdArticulo getIdArticulo() {
        return idArticulo;
    }
}
