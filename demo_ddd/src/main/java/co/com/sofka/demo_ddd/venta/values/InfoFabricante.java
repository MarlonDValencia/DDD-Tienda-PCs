package co.com.sofka.demo_ddd.venta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.io.Serializable;
import java.util.Objects;

public class InfoFabricante implements ValueObject<InfoFabricante.Properties> {
    private final String nombre;
    private final String tiempoGarantia;

    public InfoFabricante(String nombre, String tiempoGarantia) {
        this.nombre = Objects.requireNonNull(nombre, "El nombre del fabricante es requerido");
        this.tiempoGarantia = Objects.requireNonNull(tiempoGarantia,"Se debe especificar el tiempo de garantía");
        if(this.nombre.isBlank() || this.tiempoGarantia.isBlank()){
            throw new IllegalArgumentException("El nombre y tiempo de garantía son requeridos");
        }
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public String nombre() {
                return nombre;
            }
            @Override
            public String tiempoGarantia() {
                return tiempoGarantia;
            }
        };
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, tiempoGarantia);
    }

    public interface  Properties {
        String nombre();
        String tiempoGarantia();
    }
}
