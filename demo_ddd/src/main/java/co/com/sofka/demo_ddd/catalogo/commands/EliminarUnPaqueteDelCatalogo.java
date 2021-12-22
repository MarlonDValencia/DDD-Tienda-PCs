package co.com.sofka.demo_ddd.catalogo.commands;

import co.com.sofka.demo_ddd.catalogo.values.IdPaquete;
import co.com.sofka.domain.generic.Command;

public class EliminarUnPaqueteDelCatalogo extends Command {
    private final IdPaquete idPaquete;

    public EliminarUnPaqueteDelCatalogo(IdPaquete idPaquete) {
        this.idPaquete = idPaquete;
    }

    public IdPaquete getIdPaquete() {
        return idPaquete;
    }
}
