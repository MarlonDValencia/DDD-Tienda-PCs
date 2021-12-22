package co.com.sofka.demo_ddd.venta.values;

import co.com.sofka.domain.generic.Identity;

public class IdCliente extends Identity {
    public IdCliente(String value) {
        super(value);
    }

    public IdCliente(){
    }

    public static IdCliente of(String value){
        return new IdCliente(value);
    }
}
