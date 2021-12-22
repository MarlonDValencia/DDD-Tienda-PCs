package co.com.sofka.demo_ddd.catalogo;

import co.com.sofka.demo_ddd.catalogo.events.*;
import co.com.sofka.demo_ddd.catalogo.values.IdCatalogo;
import co.com.sofka.demo_ddd.catalogo.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.List;
import java.util.Optional;

public class Catalogo extends AggregateEvent<IdCatalogo> {

    protected IdStock idStock;
    protected List<Articulo> ListaDeArticulos;
    protected List<Paquete> ListaDePaquetes;
    protected IdPaquete idPaquete;


    public Catalogo(IdCatalogo idCatalogo, IdStock idStock, List<Articulo> listaDeArticulos,List<Paquete> ListaDePaquetes, IdPaquete idPaquete) {
        super(idCatalogo);
        this.idStock = idStock;
        this.ListaDeArticulos = listaDeArticulos;
        this.ListaDePaquetes = ListaDePaquetes;
        this.idPaquete = idPaquete;
    }

    public void ActualizarCatalogo(List<Articulo> ListaDeArticulos){
        this.ListaDeArticulos = ListaDeArticulos;
        appendChange((new CatalogoActualizado(ListaDeArticulos))).apply();
    }
    public void AñadirNuevoPaquete(List<Paquete> ListaDePaquetes){
        this.ListaDePaquetes = ListaDePaquetes;
        appendChange((new CatalogoActualizadoPaquetes(ListaDePaquetes))).apply();
    }

    public Optional<Articulo> SeleccionarUnArticulo(IdArticulo idArticulo){
        var Lista = ListaDeArticulos.stream().filter(
                (articulo) -> {
                    return articulo.SeleccionarArticulo(idArticulo);
                }
        );
        if(Lista.findAny().isPresent()){
            appendChange((new ArticuloSeleccionado(idArticulo))).apply();
            return Lista.findFirst();
        }return null;
    }

    public void EliminarUnArticulo(IdArticulo idArticulo){
        ListaDeArticulos.removeIf(articulo -> articulo.identity().equals(idArticulo));
        appendChange((new ArticuloEliminado(idArticulo))).apply();
    }

    public void EditarContenidoDeUnPaquete(List<Articulo> ListaDeArticulos, Paquete paquete){
        paquete.ListaDeArticulos = ListaDeArticulos;
        appendChange((new ContenidoDeUnPaqueteEditado(paquete.identity(),ListaDeArticulos))).apply();
    }

    public void EliminarUnPaqueteDelCatalogo(IdPaquete idPaquete){
        ListaDePaquetes.removeIf(paquete -> paquete.identity().equals(idPaquete));
        appendChange((new PaqueteDelCatalogoEliminado(idPaquete))).apply();
    }

    public String ConsultarStockDeUnArticulo(IdArticulo idArticulo){
        var stock = SeleccionarUnArticulo(idArticulo).get().disponibilidad().getValor();
        appendChange((new StockDeUnArticuloConsultado(idArticulo))).apply();
        return "El estado de este articulo es "+stock;
    }

    public void VaciarStockDeUnArticulo(IdArticulo idArticulo){
        SeleccionarUnArticulo(idArticulo).get().disponibilidad().valor = "Sin Stock";
        appendChange((new StockDeUnArticuloVaciado(idArticulo))).apply();
    }

    public IdStock getIdStock() {
        return idStock;
    }

    public List<Articulo> getListaDeArticulos() {
        return ListaDeArticulos;
    }

    public List<Paquete> getListaDePaquetes() {
        return ListaDePaquetes;
    }

    public IdPaquete getIdPaquete() {
        return idPaquete;
    }
}
