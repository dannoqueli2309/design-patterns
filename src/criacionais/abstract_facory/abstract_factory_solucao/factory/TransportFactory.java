package criacionais.abstract_facory.abstract_factory_solucao.factory;

import criacionais.abstract_facory.abstract_factory_solucao.aircrafts.Aircraft;
import criacionais.abstract_facory.abstract_factory_solucao.bote.Boats;
import criacionais.abstract_facory.abstract_factory_solucao.landvehicles.LandVehicle;

public interface TransportFactory {
  LandVehicle createTransportVehicle();
  Aircraft createTransportAircraft();
  Boats createTransportBoats();
}
