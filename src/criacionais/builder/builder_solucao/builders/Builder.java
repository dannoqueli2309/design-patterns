package criacionais.builder.builder_solucao.builders;

import criacionais.builder.builder_solucao.components.CarType;
import criacionais.builder.builder_solucao.components.Engine;
import criacionais.builder.builder_solucao.components.Transmission;

public interface Builder {
  void setCarType(CarType type);
  void setEngine(Engine engine);
  void setSeats(int seats);
  void setTransmission(Transmission transmission);
  void setColor(String color);
}
