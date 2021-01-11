package comportamentais.template_method;

public class ItemRaro extends Item {

  private String nome;
  private int qtd;
  private int qtdMaxRetirada;

  public ItemRaro(String nome, int qtd, int qtdMaxRetirada) {
    this.nome = nome;
    this.qtd = qtd;
    this.qtdMaxRetirada = qtdMaxRetirada;
  }

  protected boolean validaQtd(int qtd) {
    return qtd >= 0 && qtd <= Math.min(qtd, qtdMaxRetirada);
  }

  protected int getEstoque() {
    return qtd ;
  }

  protected void descontaEstoque(int qtdDescontoDoEstoque) {
    this.qtd -=qtdDescontoDoEstoque;
  }

  @Override
  public String toString() {
    return "ItemGeral{" +
        "nome='" + nome + '\'' +
        ", qtd=" + qtd +
        ", ( Max retirada=" + qtdMaxRetirada +
        ") "+
        '}';
  }
}
