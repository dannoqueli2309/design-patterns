package chain_of_responsability.compra;

public abstract class TomadorDeDecisao {
    protected TomadorDeDecisao sucessor;

    public void setSucessor(TomadorDeDecisao sucessor) {
        this.sucessor = sucessor;
    }

    public abstract void aprovar(Compra compra);
}
