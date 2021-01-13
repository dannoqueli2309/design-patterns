package estruturais.bridge.bridge_solucao.transmission;

import estruturais.bridge.bridge_solucao.platfoms.Platform;

public class AdvancedLive extends Live {

  public AdvancedLive(Platform platform) {
    super(platform);
  }

  public void subtitles() {
    System.out.println("Legendas ativadas na transmissão");
  }

  public void comments() {
    System.out.println("Comentarios liberados na live");
  }
}
