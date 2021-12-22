package co.com.sofka.demo_ddd.trabajador.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<Nombre.Properties> {
    private final String primerNombre;
    private final String primerApellido;

    public Nombre(String primerNombre, String primerApellido) {
        this.primerNombre = Objects.requireNonNull(primerNombre, "El primer nombre es requerido");
        this.primerApellido = Objects.requireNonNull(primerApellido,"El apellido es requerido");
        if(this.primerNombre.isBlank() || this.primerApellido.isBlank()){
            throw new IllegalArgumentException("El nombre y apellido son requeridos");
        }
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public String primerNombre() {
                return primerNombre;
            }
            @Override
            public String primerApellido() {
                return primerApellido;
            }
        };
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nombre nombre = (Nombre) o;
        return Objects.equals(nombre, nombre.primerNombre) && Objects.equals(nombre, nombre.primerApellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primerNombre, primerApellido);
    }

    public interface  Properties {
        String primerNombre();
        String primerApellido();
    }
}
