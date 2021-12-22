package co.com.sofka.demo_ddd.catalogo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Tamaño implements ValueObject<Integer>{
    public final int valor;

    public Tamaño(int valor){
        this.valor = valor;
    }

    @Override
    public Integer value() {
        return valor;
    }
}
