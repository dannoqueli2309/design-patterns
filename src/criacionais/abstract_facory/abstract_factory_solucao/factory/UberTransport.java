package criacionais.abstract_facory.abstract_factory_solucao.factory;

import criacionais.abstract_facory.abstract_factory_solucao.aircrafts.Aircraft;
import criacionais.abstract_facory.abstract_factory_solucao.aircrafts.Airplane;
import criacionais.abstract_facory.abstract_factory_solucao.bote.Boats;
import criacionais.abstract_facory.abstract_factory_solucao.bote.Jetski;
import criacionais.abstract_facory.abstract_factory_solucao.landvehicles.Car;
import criacionais.abstract_facory.abstract_factory_solucao.landvehicles.LandVehicle;

public class UberTransport implements TransportFactory {

  @Override
  public LandVehicle createTransportVehicle() {
    return new Car();
  }

  @Override
  public Aircraft createTransportAircraft() {
    return new Airplane();
  }

  @Override
  public Boats createTransportBoats() {
    return new Jetski();
  }
}
