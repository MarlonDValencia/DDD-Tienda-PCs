package co.com.sofka.demo_ddd.catalogo.commands;

import co.com.sofka.demo_ddd.catalogo.Articulo;
import co.com.sofka.domain.generic.Command;

import java.util.List;

public class ActualizarCatalogo extends Command {
    private final List<Articulo> ListaDeArticulos;

    public ActualizarCatalogo(List<Articulo> listaDeArticulos) {
        ListaDeArticulos = listaDeArticulos;
    }

    public List<Articulo> getListaDeArticulos() {
        return ListaDeArticulos;
    }
}
