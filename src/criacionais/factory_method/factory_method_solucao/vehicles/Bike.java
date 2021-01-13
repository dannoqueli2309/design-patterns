package criacionais.factory_method.factory_method_solucao.vehicles;

public class Bike implements Vehicle{

  @Override
  public void startRoute() {
    getCargo();
    System.out.println();
  }

  @Override
  public void getCargo() {
    System.out.println("pegando a comida");
  }
}
