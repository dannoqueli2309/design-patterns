package criacionais.builder.builder_solucao.director;

import criacionais.builder.builder_solucao.builders.Builder;
import criacionais.builder.builder_solucao.components.CarType;
import criacionais.builder.builder_solucao.components.Engine;
import criacionais.builder.builder_solucao.components.Transmission;

public class Director {

  public void constructSedanCar(Builder builder) {
    builder.setCarType(CarType.SEDAN);
    builder.setSeats(5);
    builder.setTransmission(Transmission.AUTOMATIC);
    builder.setEngine(new Engine(1600));
    builder.setColor("Vermelho");
  }

  public void constructSportCar(Builder builder) {
    builder.setCarType(CarType.SPORTCAR);
    builder.setSeats(2);
    builder.setTransmission(Transmission.AUTOMATIC);
    builder.setEngine(new Engine(4000));
    builder.setColor("Amarelo");
  }

  public void constructTruck(Builder builder) {
    builder.setCarType(CarType.TRUNCK);
    builder.setSeats(5);
    builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
    builder.setEngine(new Engine(1600));
    builder.setColor("Azul");
  }
}
