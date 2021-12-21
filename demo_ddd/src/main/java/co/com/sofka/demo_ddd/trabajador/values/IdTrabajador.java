package co.com.sofka.demo_ddd.trabajador.values;

import co.com.sofka.demo_ddd.generico.Id;
import co.com.sofka.demo_ddd.venta.values.IdProducto;

import java.util.UUID;

public class IdTrabajador extends Id {
    public IdTrabajador(String value) {
        super(value = UUID.randomUUID().toString());
    }

    public IdTrabajador(){

    }

    public static IdTrabajador of(String value){
        return new IdTrabajador(value = UUID.randomUUID().toString());
    }
}
