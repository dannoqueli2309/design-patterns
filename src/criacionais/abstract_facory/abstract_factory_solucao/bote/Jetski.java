package criacionais.abstract_facory.abstract_factory_solucao.bote;

public class Jetski implements Boats {

  @Override
  public void startRoute() {
    getRote();
    System.out.println("Estamos fazendo a entrega de barco");
  }

  @Override
  public void getRote() {
    System.out.println("Indo de barco");
  }
}
