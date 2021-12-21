package co.com.sofka.demo_ddd.venta.values;

import co.com.sofka.demo_ddd.generico.Id;

import java.util.UUID;

public class IdOrden extends Id {
    public IdOrden(String value) {
        super(value = UUID.randomUUID().toString());
    }

    public IdOrden(){

    }

    public static IdOrden of(String value){
        return new IdOrden(value = UUID.randomUUID().toString());
    }
}
