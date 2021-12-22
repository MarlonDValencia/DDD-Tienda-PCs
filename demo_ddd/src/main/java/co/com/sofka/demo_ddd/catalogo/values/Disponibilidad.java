package co.com.sofka.demo_ddd.catalogo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Disponibilidad implements ValueObject<String> {
    public String valor;
    public Disponibilidad(String valor){
        this.valor = Objects.requireNonNull(valor);
    }
    public String getValor(){
        return this.valor;
    }

    @Override
    public String value() {
        return valor;
    }
}
