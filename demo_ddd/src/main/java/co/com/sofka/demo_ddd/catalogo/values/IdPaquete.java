package co.com.sofka.demo_ddd.catalogo.values;

import co.com.sofka.demo_ddd.generico.Id;

import java.util.UUID;

public class IdPaquete extends Id {
    private IdPaquete(String value){
        super(value = UUID.randomUUID().toString());
    }

    public IdPaquete(){
    }

    public static IdPaquete of(String value){
        return new IdPaquete(value = UUID.randomUUID().toString());
    }
}
