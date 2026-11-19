package padroesestruturais.facade;

public class Pedido {

    public boolean aprovar() {
        return PedidoFacade.verificarPendenciasPedido(this);
    }
}
