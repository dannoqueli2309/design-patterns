package comportamentais.state;

public class AcaoEmAlta implements State {

  @Override
  public byte getNivel() {
    return (byte) 3;
  }

  @Override
  public boolean isValor(float valor) {
    return valor > 20;
  }
}
