package co.com.sofka.demo_ddd.venta.values;

import co.com.sofka.domain.generic.Identity;

import java.util.UUID;

public class IdOrden extends Identity {
    public IdOrden(String value) {
        super(value);
    }

    public IdOrden(){
    }

    public static IdOrden of(String value){
        return new IdOrden(value);
    }
}
