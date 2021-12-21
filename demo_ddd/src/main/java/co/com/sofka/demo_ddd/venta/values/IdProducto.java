package co.com.sofka.demo_ddd.venta.values;

import co.com.sofka.demo_ddd.generico.Id;

import java.util.UUID;

public class IdProducto extends Id {
    public IdProducto(String value) {
        super(value = UUID.randomUUID().toString());
    }

    public IdProducto(){

    }

    public static IdProducto of(String value){
        return new IdProducto(value = UUID.randomUUID().toString());
    }
}
