package co.com.sofka.demo_ddd.catalogo.values;

import co.com.sofka.demo_ddd.generico.Id;

import java.util.UUID;

public class IdStock extends Id {
    private IdStock(String value){
        super(value = UUID.randomUUID().toString());
    }

    public IdStock(){
    }

    public static IdStock of(String value){
        return new IdStock(value = UUID.randomUUID().toString());
    }
}
