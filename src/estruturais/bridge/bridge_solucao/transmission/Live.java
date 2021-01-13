package estruturais.bridge.bridge_solucao.transmission;

import estruturais.bridge.bridge_solucao.platfoms.Platform;

public class Live implements Transmission {

  private Platform platform;

  public Live() {
  }

  public Live(Platform platform) {
    this.platform = platform;
  }

  @Override
  public void broadCasting() {
    System.out.println("Iniciando Transmissão");
  }

  @Override
  public void result() {
    System.out.println("*****ON AIR******");
  }
}
