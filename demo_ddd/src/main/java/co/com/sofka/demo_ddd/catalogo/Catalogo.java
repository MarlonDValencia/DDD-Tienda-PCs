package co.com.sofka.demo_ddd.catalogo;

import co.com.sofka.demo_ddd.catalogo.events.*;
import co.com.sofka.demo_ddd.catalogo.values.IdCatalogo;
import co.com.sofka.demo_ddd.catalogo.values.*;
import co.com.sofka.demo_ddd.generico.AggregateRoot;
import co.com.sofka.demo_ddd.generico.Id;

import java.util.List;
import java.util.Optional;

public class Catalogo extends AggregateRoot<IdCatalogo> {

    private final IdStock idStock;
    private List<Articulo> ListaDeArticulos;
    private List<Paquete> ListaDePaquetes;
    private final IdPaquete idPaquete;


    public Catalogo(Id id, IdStock idStock, List<Articulo> listaDeArticulos,List<Paquete> ListaDePaquetes, IdPaquete idPaquete) {
        super(id);
        this.idStock = idStock;
        this.ListaDeArticulos = listaDeArticulos;
        this.ListaDePaquetes = ListaDePaquetes;
        this.idPaquete = idPaquete;
    }

    public void ActualizarCatalogo(List<Articulo> ListaDeArticulos){
        this.ListaDeArticulos = ListaDeArticulos;
        this.applyChange((new CatalogoActualizado(ListaDeArticulos)));
    }
    public void AñadirNuevoPaquete(List<Paquete> ListaDePaquetes){
        this.ListaDePaquetes = ListaDePaquetes;
        this.applyChange((new CatalogoActualizadoPaquetes(ListaDePaquetes)));
    }

    public Optional<Articulo> SeleccionarUnArticulo(IdArticulo idArticulo){
        var Lista = ListaDeArticulos.stream().filter(
                (articulo) -> {
                    return articulo.SeleccionarArticulo(idArticulo);
                }
        );
        if(Lista.findAny().isPresent()){
            applyChange((new ArticuloSeleccionado(idArticulo)));
            return Lista.findFirst();
        }return null;
    }

    public void EliminarUnArticulo(IdArticulo idArticulo){
        ListaDeArticulos.removeIf(articulo -> articulo.getId().equals(idArticulo));
        applyChange((new ArticuloEliminado(idArticulo)));
    }

    public void EditarContenidoDeUnPaquete(List<Articulo> ListaDeArticulos, Paquete paquete){
        paquete.ListaDeArticulos = ListaDeArticulos;
        applyChange((new ContenidoDeUnPaqueteEditado(paquete.getId(),ListaDeArticulos)));
    }

    public void EliminarUnPaqueteDelCatalogo(IdPaquete idPaquete){
        ListaDePaquetes.removeIf(paquete -> paquete.getId().equals(idPaquete));
        applyChange((new PaqueteDelCatalogoEliminado(idPaquete)));
    }

    public String ConsultarStockDeUnArticulo(IdArticulo idArticulo){
        var stock = SeleccionarUnArticulo(idArticulo).get().disponibilidad().getValor();
        applyChange((new StockDeUnArticuloConsultado(idArticulo)));
        return "El estado de este articulo es "+stock;
    }

    public void VaciarStockDeUnArticulo(IdArticulo idArticulo){
        SeleccionarUnArticulo(idArticulo).get().disponibilidad().valor = "Sin Stock";
        applyChange((new StockDeUnArticuloVaciado(idArticulo)));
    }
}
