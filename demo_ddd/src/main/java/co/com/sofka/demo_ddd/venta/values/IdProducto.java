package co.com.sofka.demo_ddd.venta.values;

import co.com.sofka.domain.generic.Identity;

import java.util.UUID;

public class IdProducto extends Identity {
    public IdProducto(String value) {
        super(value);
    }

    public IdProducto(){
    }

    public static IdProducto of(String value){
        return new IdProducto(value);
    }
}
