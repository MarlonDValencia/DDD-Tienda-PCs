package co.com.sofka.demo_ddd.catalogo.values;

import co.com.sofka.domain.generic.Identity;

public class IdStock extends Identity {
    private IdStock(String value){
        super(value);
    }

    public IdStock(){
    }

    public static IdStock of(String value){
        return new IdStock(value);
    }
}
