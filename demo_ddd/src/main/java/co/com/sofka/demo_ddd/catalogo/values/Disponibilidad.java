package co.com.sofka.demo_ddd.catalogo.values;

import java.io.Serializable;

public class Disponibilidad implements Serializable {
    public String valor;
    public Disponibilidad(String valor){
        this.valor = valor;
    }
    public String getValor(){
        return this.valor;
    }
}
