package chain_of_responsability.compra;

public class Presidente extends TomadorDeDecisao {

    @Override
    public void aprovar(Compra compra) {
        if (compra.getValor() >= 1000000) {
            System.out.println("Compra aprovada pelo Presidente");
        }
    }
}
