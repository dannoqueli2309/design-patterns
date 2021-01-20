package criacionais.abstract_facory.abstract_factory_solucao.aircrafts;

public class Helicopter implements Aircraft {

  @Override
  public void startRoute() {
    wind();
    getRote();
    System.out.println("Iniciando a decolagem");
  }

  @Override
  public void getRote() {
    System.out.println("Passageiros a bordo, ligando hélices");
  }

  @Override
  public void wind() {
    System.out.println("Ventos a 25km, Suldeste, ventos ok");
  }
}
