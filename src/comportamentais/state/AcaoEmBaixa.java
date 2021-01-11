package comportamentais.state;

public class AcaoEmBaixa implements State {

  @Override
  public byte getNivel() {
    return (byte) 1;
  }

  @Override
  public boolean isValor(float valor) {
    return valor < 4;
  }
}
