package co.com.sofka.demo_ddd.catalogo;

import co.com.sofka.demo_ddd.catalogo.values.*;
import co.com.sofka.domain.generic.Entity;

import java.util.List;

public class Paquete extends Entity<IdPaquete> {
    private final Precio precio;
    private final Tamaño tamaño;
    private final Estado estado;
    public List<Articulo> ListaDeArticulos;

    public Paquete(IdPaquete idPaquete, Precio precio, Tamaño tamaño, Estado estado, List<Articulo> ListaDeArticulos){
        super(idPaquete);
        this.precio = precio;
        this.tamaño = tamaño;
        this.estado = estado;
        this.ListaDeArticulos = ListaDeArticulos;
    }

    public void EditarPaquete(List<Articulo> ListaDeArticulos){
        this.ListaDeArticulos = ListaDeArticulos;
    }

    public void EliminarPaquete(IdPaquete idPaquete){
        ListaDeArticulos.removeIf(articulo -> articulo.identity().equals(idPaquete));
    }
}
