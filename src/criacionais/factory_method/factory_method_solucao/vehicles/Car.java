package criacionais.factory_method.factory_method_solucao.vehicles;

public class Car implements Vehicle {

  @Override
  public void startRoute() {
    getCargo();
    System.out.println("Iniciando o trajeto");
  }

  @Override
  public void getCargo() {
    System.out.println("Pegando os passageros, estamos prontos");
  }
}
