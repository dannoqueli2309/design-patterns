package criacionais.factory_method.factory_method_solucao;

import criacionais.factory_method.factory_method_solucao.vehicles.Vehicle;

public abstract class Transport {

  void startTransport() {
    Vehicle vehicle = createTransport();
    vehicle.startRoute();
  }

  protected abstract Vehicle createTransport();
}
