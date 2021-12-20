package co.com.sofka.demo_ddd.venta.values;

import co.com.sofka.demo_ddd.generico.Id;

public class IdVenta extends Id {
    private IdVenta(String value){
        super(value);
    }

    public IdVenta(){
    }

    public static IdVenta of(String value){
        return new IdVenta(value);
    }
}
