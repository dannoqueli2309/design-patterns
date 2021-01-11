package criacionais.factory_method;

public class CriadorDeCarrosConcreto extends CriadorDeCarros{

  @Override
  public Opala factorOpala() {
    return new Opala();
  }

  @Override
  public Vectra factorVecta() {
    return new Vectra();
  }
}
