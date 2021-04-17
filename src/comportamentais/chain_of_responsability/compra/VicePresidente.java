package chain_of_responsability.compra;

public class VicePresidente extends TomadorDeDecisao {

    @Override
    public void aprovar(Compra compra) {
        if (compra.getValor() < 900000) {
            System.out.println("Compra aprovada pelo Vice Presidente");
        } else if (sucessor != null) {
            sucessor.aprovar(compra);
        }
    }
}
