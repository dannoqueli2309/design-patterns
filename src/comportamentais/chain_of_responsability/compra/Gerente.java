package chain_of_responsability.compra;

public class Gerente extends TomadorDeDecisao {

    @Override
    public void aprovar(Compra compra) {
        if (compra.getValor() < 1000) {
            System.out.println("Compra aprovada pelo Gerente");
        } else if (sucessor != null) {
            sucessor.aprovar(compra);
        }
    }
}
