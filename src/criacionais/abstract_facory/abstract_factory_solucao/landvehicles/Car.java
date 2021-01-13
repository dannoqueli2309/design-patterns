package criacionais.abstract_facory.abstract_factory_solucao.landvehicles;

public class Car implements LandVehicle {

  @Override
  public void startRoute() {
    getRote();
    System.out.println("Iniciando o trajeto");
  }

  @Override
  public void getRote() {
    System.out.println("Pegando os passageiros");

  }
}
