package criacionais.factory_method.factory_method_solucao.vehicles;

public class Motorcycle implements Vehicle {

  @Override
  public void startRoute() {
    getCargo();
    System.out.println("Iniciando a entrega");
  }

  @Override
  public void getCargo() {
    System.out.println("Pegar a encomenda");
  }
}
