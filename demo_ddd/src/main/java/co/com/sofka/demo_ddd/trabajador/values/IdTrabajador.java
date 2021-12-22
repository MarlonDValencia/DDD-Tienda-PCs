package co.com.sofka.demo_ddd.trabajador.values;

import co.com.sofka.domain.generic.Identity;

public class IdTrabajador extends Identity {
    public IdTrabajador(String value) {
        super(value);
    }

    public IdTrabajador(){
    }

    public static IdTrabajador of(String value){
        return new IdTrabajador(value);
    }
}
