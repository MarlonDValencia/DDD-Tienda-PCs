package co.com.sofka.demo_ddd.catalogo.values;

import co.com.sofka.demo_ddd.generico.Id;
import co.com.sofka.demo_ddd.venta.values.IdVenta;

import java.util.UUID;

public class IdCatalogo extends Id {
    private IdCatalogo(String value){
        super(value = UUID.randomUUID().toString());
    }

    public IdCatalogo(){
    }

    public static IdCatalogo of(String value){
        return new IdCatalogo(value = UUID.randomUUID().toString());
    }
}
