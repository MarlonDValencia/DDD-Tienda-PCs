package co.com.sofka.demo_ddd.catalogo;

import co.com.sofka.demo_ddd.catalogo.values.Categoria;
import co.com.sofka.demo_ddd.catalogo.values.Disponibilidad;
import co.com.sofka.demo_ddd.catalogo.values.IdArticulo;
import co.com.sofka.demo_ddd.venta.values.Precio;
import co.com.sofka.domain.generic.Entity;

public class Articulo extends Entity<IdArticulo> {
    private Disponibilidad disponibilidad;
    private Precio precio;
    private Categoria categoria;

    public Articulo(IdArticulo idArticulo, Disponibilidad disponibilidad, Precio precio, Categoria categoria) {
        super(idArticulo);
        this.disponibilidad = disponibilidad;
        this.precio = precio;
        this.categoria = categoria;
    }


    public boolean SeleccionarArticulo(IdArticulo idArticulo){
        return this.identity().equals(idArticulo);
    }


    public Disponibilidad disponibilidad(){
        return this.disponibilidad;
    }

    public Precio precio(){
        return this.precio;
    }

    public Categoria categoria(){
        return this.categoria;
    }
}
