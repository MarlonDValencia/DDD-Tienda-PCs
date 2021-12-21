package co.com.sofka.demo_ddd.venta.values;

import co.com.sofka.demo_ddd.generico.Id;

import java.util.UUID;

public class IdVenta extends Id {
    private IdVenta(String value){
        super(value = UUID.randomUUID().toString());
    }

    public IdVenta(){
    }

    public static IdVenta of(String value){
        return new IdVenta(value = UUID.randomUUID().toString());
    }
}
