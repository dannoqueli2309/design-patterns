package criacionais.abstract_facory.abstract_factory_solucao.factory;

import criacionais.abstract_facory.abstract_factory_solucao.aircrafts.Aircraft;
import criacionais.abstract_facory.abstract_factory_solucao.aircrafts.Helicopter;
import criacionais.abstract_facory.abstract_factory_solucao.bote.Boats;
import criacionais.abstract_facory.abstract_factory_solucao.bote.Jetski;
import criacionais.abstract_facory.abstract_factory_solucao.landvehicles.LandVehicle;
import criacionais.abstract_facory.abstract_factory_solucao.landvehicles.Motocycle;

public class NineNineTrasport implements TransportFactory {

  @Override
  public LandVehicle createTransportVehicle() {
    return new Motocycle();
  }

  @Override
  public Aircraft createTransportAircraft() {
    return new Helicopter();
  }

  @Override
  public Boats createTransportBoats() {
    return new Jetski();
  }
}
