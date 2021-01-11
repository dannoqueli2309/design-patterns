package criacionais.builder;

public class MontadoraVeiculoBuilder implements MontadoraBuilder {

  private Veiculo veiculo;

  @Override
  public void montar(char tipo, String modelo) {
    switch (tipo) {
      case 'f':
        veiculo = new Ferrari(modelo);
      case 'j':
        veiculo = new Jeep(modelo);
    }
  }

  @Override
  public Veiculo getVeiculo() {
    return this.veiculo;
  }
}
