package criacionais.abstract_facory.abstract_factory_solucao.landvehicles;

public class Motocycle implements LandVehicle {

  @Override
  public void startRoute() {
    getRote();
    System.out.println("Iniciando a entrega");
  }

  @Override
  public void getRote() {
    System.out.println("Já pegamos a incomenda");
  }
}
