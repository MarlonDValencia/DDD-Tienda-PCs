package co.com.sofka.demo_ddd.catalogo.commands;

import co.com.sofka.demo_ddd.catalogo.Paquete;
import co.com.sofka.domain.generic.Command;

import java.util.List;

public class AñadirNuevoPaquete extends Command {
    private final List<Paquete> ListaDePaquetes;

    public AñadirNuevoPaquete(List<Paquete> listaDePaquetes) {
        ListaDePaquetes = listaDePaquetes;
    }

    public List<Paquete> getListaDePaquetes() {
        return ListaDePaquetes;
    }
}
