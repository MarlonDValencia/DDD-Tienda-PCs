package co.com.sofka.demo_ddd.catalogo.commands;

import co.com.sofka.demo_ddd.catalogo.Articulo;
import co.com.sofka.demo_ddd.catalogo.Paquete;
import co.com.sofka.domain.generic.Command;

import java.util.List;

public class EditarContenidoDeUnPaquete extends Command {
    private final List<Articulo> ListaDeArticulos;
    private final Paquete paquete;

    public EditarContenidoDeUnPaquete(List<Articulo> listaDeArticulos, Paquete paquete) {
        ListaDeArticulos = listaDeArticulos;
        this.paquete = paquete;
    }

    public List<Articulo> getListaDeArticulos() {
        return ListaDeArticulos;
    }

    public Paquete getPaquete() {
        return paquete;
    }
}
