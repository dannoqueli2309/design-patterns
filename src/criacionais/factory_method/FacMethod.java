package   factory_method;

public class FacMethod {

  public static void main(String[] args) {
    new FacMethod().costruir();
  }

  public void costruir() {
    CriadorDeCarros factorMethodCarro = new CriadorDeCarrosConcreto();

    Veiculo vectra = factorMethodCarro.factorVecta();
    System.out.println(vectra.getModelo());

    Veiculo opala = factorMethodCarro.factorOpala();
    System.out.println(opala.getModelo());

  }
}
