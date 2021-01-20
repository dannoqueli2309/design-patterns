package criacionais.factory_method.factory_method_solucao;

import criacionais.factory_method.factory_method_solucao.vehicles.Motorcycle;
import criacionais.factory_method.factory_method_solucao.vehicles.Vehicle;

public class MotorcyclesTransport extends Transport {

  @Override
  protected Vehicle createTransport() {
    return new Motorcycle();
  }
}
