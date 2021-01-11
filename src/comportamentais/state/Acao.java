package comportamentais.state;

public class Acao {

  private String empresa;
  private float valor;
  private Variacao variacao = new Variacao();

  public Acao(String empresa) {
    this.empresa = empresa;
  }

  public void setValor(float valor) {
    if (variacao.isTroca(valor)) {
      this.valor = valor;
    } else {
      System.out.println("Troca de valor indevida");
    }
  }

  @Override
  public String toString() {
    return "Acao{" +
        "empresa='" + empresa + '\'' +
        ", valor=" + valor +
        '}';
  }
}
