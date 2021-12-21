package co.com.sofka.demo_ddd.catalogo.values;

import co.com.sofka.demo_ddd.generico.Id;

import java.util.UUID;

public class IdArticulo extends Id {
    private IdArticulo(String value){
        super(value = UUID.randomUUID().toString());
    }

    public IdArticulo(){
    }

    public static IdArticulo of(String value){
        return new IdArticulo(value = UUID.randomUUID().toString());
    }
}
