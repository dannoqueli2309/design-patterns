package criacionais.builder;

public class Montadora {

  private MontadoraBuilder builder = new MontadoraVeiculoBuilder();

  public Veiculo montar(char tipo, String modelo) {
    builder.montar(tipo, modelo);
    return builder.getVeiculo();
  }
}
