package    template_method;

public class ItemGeral extends Item {

  private String nome;
  private int qtd;
  private int qtdMatriz;

  public ItemGeral(String nome, int qtd, int qtdMatriz) {
    this.nome = nome;
    this.qtd = qtd;
    this.qtdMatriz = qtdMatriz;
  }

  protected boolean validaQtd(int qtd) {
    return qtd >= 0;
  }

  protected int getEstoque() {
    return qtd + qtdMatriz;
  }

  protected void descontaEstoque(int qtdDescontoDoEstoque) {
    if (qtdDescontoDoEstoque > this.qtd) {
      qtdDescontoDoEstoque -= this.qtd;
      this.qtd = 0;
      qtdMatriz -= qtdDescontoDoEstoque;
    } else {
      this.qtd -= qtdDescontoDoEstoque;
    }
  }

  @Override
  public String toString() {
    return "ItemGeral{" +
        "nome='" + nome + '\'' +
        ", qtd=" + qtd +
        ", qtdMatriz=" + qtdMatriz +
        '}';
  }
}
