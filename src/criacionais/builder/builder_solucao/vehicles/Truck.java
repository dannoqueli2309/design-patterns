package criacionais.builder.builder_solucao.vehicles;

import criacionais.builder.builder_solucao.components.CarType;
import criacionais.builder.builder_solucao.components.Engine;
import criacionais.builder.builder_solucao.components.Transmission;

public class Truck {

  private final CarType carType;
  private final int seats;
  private final Engine engine;
  private final Transmission transmission;

  public Truck(CarType carType, int seats, Engine engine,
      Transmission transmission) {
    this.carType = carType;
    this.seats = seats;
    this.engine = engine;
    this.transmission = transmission;
  }

  public CarType getCarType() {
    return this.carType;
  }

  public int getSeats() {
    return this.seats;
  }

  public Engine getEngine() {
    return this.engine;
  }

  public Transmission getTransmission() {
    return this.transmission;
  }

  public String result() {
    return "trunck with motor"
        + engine.getPower() +
        "\n"
        + "Transmission" + transmission;
  }

}
