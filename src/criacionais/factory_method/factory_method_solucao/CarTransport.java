package criacionais.factory_method.factory_method_solucao;

import criacionais.factory_method.factory_method_solucao.vehicles.Car;
import criacionais.factory_method.factory_method_solucao.vehicles.Vehicle;

public class CarTransport extends Transport {

  @Override
  protected Vehicle createTransport() {
    return new Car();
  }
}
