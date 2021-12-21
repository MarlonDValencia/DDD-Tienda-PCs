package co.com.sofka.demo_ddd.catalogo.values;

import java.io.Serializable;

public class Estado implements Serializable {
    private final String value;

    public Estado(String value) {
        this.value = value;
    }

    public String getEstado(){
        return this.value;
    }
}
