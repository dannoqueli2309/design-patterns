package chain_of_responsability.compra;

public class Diretor extends TomadorDeDecisao {

    @Override
    public void aprovar(Compra compra) {
        if (compra.getValor() < 40000) {
            System.out.println("Compra aprovada pelo Diretor");
        } else if (sucessor != null) {
            sucessor.aprovar(compra);
        }
    }
}
