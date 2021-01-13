package estruturais.bridge.bridge_solucao.transmission;

import estruturais.bridge.bridge_solucao.platfoms.Platform;

public class RecordLive extends Live {

  private Platform platform;

  public RecordLive(Platform platform) {
    super(platform);
    this.platform = platform;
  }

  public void recordLive() {
    System.out.println("Record live: " + platform.getClass().getSimpleName());
  }
}
