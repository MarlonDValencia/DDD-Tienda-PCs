package co.com.sofka.demo_ddd.venta.values;

import co.com.sofka.demo_ddd.generico.Id;

import java.util.UUID;

public class IdCliente extends Id {
    public IdCliente(String value) {
        super(value = UUID.randomUUID().toString());
    }

    public IdCliente(){

    }

    public static IdCliente of(String value){
        return new IdCliente(value = UUID.randomUUID().toString());
    }
}
