package criacionais.builder.builder_solucao.vehicles;

import criacionais.builder.builder_solucao.components.CarType;
import criacionais.builder.builder_solucao.components.Engine;
import criacionais.builder.builder_solucao.components.Transmission;

public class Car {

  private CarType carType;
  private int seats;
  private Engine engine;
  private Transmission transmission;
  private String color;

  public Car(CarType carType, int seats, Engine engine,
      Transmission transmission, String color) {
    this.carType = carType;
    this.seats = seats;
    this.engine = engine;
    this.transmission = transmission;
    this.color = color;
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

  public String getColor() {
    return color;
  }
}
