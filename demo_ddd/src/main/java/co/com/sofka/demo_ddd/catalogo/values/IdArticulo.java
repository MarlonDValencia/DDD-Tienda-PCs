package co.com.sofka.demo_ddd.catalogo.values;

import co.com.sofka.domain.generic.Identity;

import java.util.UUID;

public class IdArticulo extends Identity {
    private IdArticulo(String value){
        super(value);
    }

    public IdArticulo(){
    }

    public static IdArticulo of(String value){
        return new IdArticulo(value);
    }
}
