package  facade;

public class RegraDeNegocioFacade {

  public static final float PORCENTAGEM_VALOR_VENDA = 0.5f;
  private Cliente cliente;
  private Gravadora gravadora;

  public RegraDeNegocioFacade() {
    cliente = new Cliente();
    gravadora = new Gravadora();
  }

  public void comprar(Categoria categoria) {
    CD cd = new CD(categoria);
    cliente.addCompra();
    gravadora.setRepasse(cd.getPreco() * PORCENTAGEM_VALOR_VENDA);
  }

  public void aluga(Categoria categoria) {
    CD cd = new CD(categoria);
    cliente.addAlugar();
    gravadora.setRepasse(cd.getPreco() * PORCENTAGEM_VALOR_VENDA);
  }

  @Override
  public String toString() {
    return "Cliente: " + this.cliente.toString()
        + "\n" +
        "Gravadora: " + this.gravadora.toString();
  }
}
