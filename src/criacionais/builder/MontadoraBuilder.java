package   builder;

public interface MontadoraBuilder {
  void montar(char tipo, String modelo);
  Veiculo getVeiculo();
}
