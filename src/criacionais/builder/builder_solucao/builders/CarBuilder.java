package criacionais.builder.builder_solucao.builders;

import criacionais.builder.builder_solucao.components.CarType;
import criacionais.builder.builder_solucao.components.Engine;
import criacionais.builder.builder_solucao.components.Transmission;
import criacionais.builder.builder_solucao.vehicles.Car;

public class CarBuilder implements Builder {

  private CarType carType;
  private int seats;
  private Transmission transmission;
  private Engine engine;
  private String color;

  @Override
  public void setCarType(CarType carType) {
    this.carType = carType;
  }

  @Override
  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  @Override
  public void setSeats(int seats) {
    this.seats = seats;
  }

  @Override
  public void setTransmission(Transmission transmission) {
    this.transmission = transmission;
  }

  @Override
  public void setColor(String color) {
    this.color = color;
  }

  public Car getResult() {
    return new Car(carType, seats, engine, transmission, color);
  }
}
