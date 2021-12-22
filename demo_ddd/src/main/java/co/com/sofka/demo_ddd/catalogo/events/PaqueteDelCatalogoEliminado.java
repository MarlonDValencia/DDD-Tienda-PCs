package co.com.sofka.demo_ddd.catalogo.events;

import co.com.sofka.demo_ddd.catalogo.values.IdPaquete;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Objects;

public class PaqueteDelCatalogoEliminado extends DomainEvent {
    private final IdPaquete idPaquete;

    public PaqueteDelCatalogoEliminado(IdPaquete idPaquete){
        super("PCSoluciones.venta.PaqueteDelCatalogoEliminado");
        this.idPaquete = Objects.requireNonNull(idPaquete);
    }

    public IdPaquete getIdPaquete(){
        return this.idPaquete;
    }
}
