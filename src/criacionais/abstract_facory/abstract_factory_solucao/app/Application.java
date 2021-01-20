package criacionais.abstract_facory.abstract_factory_solucao.app;

import criacionais.abstract_facory.abstract_factory_solucao.aircrafts.Aircraft;
import criacionais.abstract_facory.abstract_factory_solucao.bote.Boats;
import criacionais.abstract_facory.abstract_factory_solucao.factory.TransportFactory;
import criacionais.abstract_facory.abstract_factory_solucao.landvehicles.LandVehicle;

public class Application {

  private LandVehicle vehicle;
  private Aircraft aircraft;
  private Boats boats;

  public Application(TransportFactory factory) {
    vehicle = factory.createTransportVehicle();
    aircraft = factory.createTransportAircraft();
    boats = factory.createTransportBoats();
  }

  public void startRoute() {
    vehicle.startRoute();
    aircraft.startRoute();
    boats.startRoute();
  }
}
