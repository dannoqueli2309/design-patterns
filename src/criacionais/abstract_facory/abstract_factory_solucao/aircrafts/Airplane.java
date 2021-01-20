package criacionais.abstract_facory.abstract_factory_solucao.aircrafts;

public class Airplane implements Aircraft {

  @Override
  public void startRoute() {
    wind();
    getRote();
    System.out.println("Iniciando a decolagem");
  }

  @Override
  public void getRote() {
    System.out.println("Passageiros a bordo, voo autorizado");
  }

  @Override
  public void wind() {
    System.out.println("Ventos a 25km, ventos ok");
  }
}
