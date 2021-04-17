package chain_of_responsability.compra;

public class MeuApp {

    public static void main(String[] args) {
        TomadorDeDecisao presidente = new Presidente();
        TomadorDeDecisao vicePresidente = new VicePresidente();
        TomadorDeDecisao diretor = new Diretor();
        TomadorDeDecisao gerente = new Gerente();

        gerente.setSucessor(diretor);
        diretor.setSucessor(vicePresidente);
        vicePresidente.setSucessor(presidente);

        Compra compra = new Compra(300000.00);
        gerente.aprovar(compra);

    }
}
