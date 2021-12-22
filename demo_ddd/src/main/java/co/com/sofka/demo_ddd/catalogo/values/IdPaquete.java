package co.com.sofka.demo_ddd.catalogo.values;

import co.com.sofka.domain.generic.Identity;
import java.util.UUID;

public class IdPaquete extends Identity {
    private IdPaquete(String value){
        super(value);
    }

    public IdPaquete(){
    }

    public static IdPaquete of(String value){
        return new IdPaquete(value);
    }
}
