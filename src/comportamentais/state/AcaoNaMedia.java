package    state;

public class AcaoNaMedia implements State {

  @Override
  public byte getNivel() {
    return (byte) 2;
  }

  @Override
  public boolean isValor(float valor) {
    return valor >= 4 && valor <= 20;
  }
}
