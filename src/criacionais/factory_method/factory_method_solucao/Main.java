package criacionais.factory_method.factory_method_solucao;

import static java.util.Objects.nonNull;

public class Main {

  private static Transport transport;

  public static void main(String[] args) {
    configure(args[0]);
    if (nonNull(transport)) {
      runTransport();
    }
  }

  private static void runTransport() {
    transport.startTransport();
  }

  private static void configure(String type) {
    switch (type) {
      case "uber":
        transport = new CarTransport();
        break;
      case "log":
        transport = new MotorcyclesTransport();
        break;
      case "eats":
        transport = new BikeTransport();
      default:
        System.out.println("Selecione o tipo de entrega");
    }
  }
}
