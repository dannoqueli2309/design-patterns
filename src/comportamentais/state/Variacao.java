package    state;

public class Variacao {

  private State atual;

  public Variacao() {
    this.atual = new AcaoEmBaixa();
  }

  public boolean isTroca(float valor) {
    if (atual.isValor(valor)) {
      return true;
    }
    State novo = trocarAtual(valor);
    if (novo.getNivel() == atual.getNivel() + 1 ||
        novo.getNivel() == atual.getNivel() - 1) {
      this.atual = novo;
      return true;
    }
    return false;
  }

  private State trocarAtual(float valor) {
    AcaoEmAlta acaoAlta = new AcaoEmAlta();
    AcaoNaMedia acaoMedia = new AcaoNaMedia();
    AcaoEmBaixa acaoBaixa = new AcaoEmBaixa();

    if (acaoAlta.isValor(valor)) {
      return acaoAlta;
    } else if (acaoBaixa.isValor(valor)) {
      return acaoBaixa;
    } else {
      return acaoMedia;
    }

  }
}
