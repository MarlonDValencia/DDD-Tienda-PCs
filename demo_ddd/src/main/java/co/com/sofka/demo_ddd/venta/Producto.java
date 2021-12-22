package co.com.sofka.demo_ddd.venta;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.demo_ddd.venta.values.*;

import java.util.Objects;

public class Producto extends Entity<IdProducto> {

    private final InfoFabricante infoFabricante;
    private final Recibo recibo;
    private Precio precio;

    public Producto(IdProducto idProducto, Precio precio, InfoFabricante infoFabricante, Recibo recibo){
        super(idProducto);
        this.precio = Objects.requireNonNull(precio);
        this.infoFabricante = Objects.requireNonNull(infoFabricante);;
        this.recibo = Objects.requireNonNull(recibo);
    }

    public void editarPrecio(Precio precio){
        this.precio = Objects.requireNonNull(precio);
    }

    public Precio precio(){
        return precio;
    }

    public InfoFabricante infoFabricante(){
        return infoFabricante;
    }

    public Recibo recibo(){
        return recibo;
    }



}
