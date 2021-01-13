package criacionais.abstract_facory.abstract_factory_solucao;

import criacionais.abstract_facory.abstract_factory_solucao.app.Application;
import criacionais.abstract_facory.abstract_factory_solucao.factory.BoatTransport;
import criacionais.abstract_facory.abstract_factory_solucao.factory.NineNineTrasport;
import criacionais.abstract_facory.abstract_factory_solucao.factory.TransportFactory;
import criacionais.abstract_facory.abstract_factory_solucao.factory.UberTransport;

public class FactorMain {

  public static Application configureApplication() {
    TransportFactory factory = null;
    String company = "boat";

    if (company == "uber") {
      factory = new UberTransport();
    } else if (company == "99") {
      factory = new NineNineTrasport();
    } else {
      factory = new BoatTransport();
    }

    return new Application(factory);
  }

  public static void main(String[] args) {
    Application app = configureApplication();
    app.startRoute();
  }
}
