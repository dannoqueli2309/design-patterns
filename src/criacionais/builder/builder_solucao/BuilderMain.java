package criacionais.builder.builder_solucao;

import criacionais.builder.builder_solucao.builders.CarBuilder;
import criacionais.builder.builder_solucao.builders.SportBuilder;
import criacionais.builder.builder_solucao.builders.TruckBuilder;
import criacionais.builder.builder_solucao.director.Director;
import criacionais.builder.builder_solucao.vehicles.Car;
import criacionais.builder.builder_solucao.vehicles.Truck;

public class BuilderMain {

  public static void main(String[] args) {
    Director director = new Director();

    CarBuilder builder = new CarBuilder();
    director.constructSedanCar(builder);

    Car car = builder.getResult();
    System.out.println(car.getCarType() + "Produzido com sucesso");

    SportBuilder sportBuilder = new SportBuilder();
    director.constructSportCar(sportBuilder);

    Car carSportivo = sportBuilder.getResult();
    System.out
        .println("Novo carro:" + carSportivo.getCarType() + "Com a cor" + carSportivo.getColor());

    TruckBuilder truckBuilder = new TruckBuilder();
    director.constructTruck(truckBuilder);

    Truck truck = truckBuilder.getResult();
    System.out.println(truck.result() + "Produzido com sucesso");
  }
}
