package co.com.sofka.demo_ddd.catalogo.events;

import co.com.sofka.demo_ddd.catalogo.Articulo;
import co.com.sofka.demo_ddd.catalogo.values.IdPaquete;
import co.com.sofka.demo_ddd.generico.DomainEvent;
import co.com.sofka.demo_ddd.venta.values.*;

import java.util.List;
import java.util.Objects;

public class ContenidoDeUnPaqueteEditado extends DomainEvent {
    private final IdPaquete idPaquete;
    private final List<Articulo> ListaDeArticulos;
    public ContenidoDeUnPaqueteEditado(IdPaquete idPaquete, List<Articulo> ListaDeArticulos){
        super("PCSoluciones.venta.ContenidoDeUnPaqueteEditado");
        this.idPaquete = idPaquete;
        this.ListaDeArticulos = Objects.requireNonNull(ListaDeArticulos);
    }

    public List<Articulo> getListaDeArticulos(){
        return this.ListaDeArticulos;
    }
}
