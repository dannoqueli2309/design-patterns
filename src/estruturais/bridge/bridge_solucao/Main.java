package estruturais.bridge.bridge_solucao;

import estruturais.bridge.bridge_solucao.platfoms.DisneyPlus;
import estruturais.bridge.bridge_solucao.platfoms.Facebook;
import estruturais.bridge.bridge_solucao.platfoms.Platform;
import estruturais.bridge.bridge_solucao.platfoms.TwitchTv;
import estruturais.bridge.bridge_solucao.platfoms.YouTube;
import estruturais.bridge.bridge_solucao.transmission.AdvancedLive;
import estruturais.bridge.bridge_solucao.transmission.Live;
import estruturais.bridge.bridge_solucao.transmission.RecordLive;

public class Main {

  public static void main(String[] args) {
    startLive(new YouTube());
    startLive(new TwitchTv());

    Platform facebookPlatform = new Facebook();
    startLive(facebookPlatform);
    record(facebookPlatform);

    Platform disneyPlusPlatform = new DisneyPlus();
    startLive(disneyPlusPlatform);
    record(disneyPlusPlatform);

  }

  public static void startLive(Platform platform) {
    System.out.println("Iniciando a Transmissão... Aguarde");
    Live live = new Live(platform);
    live.broadCasting();
    live.result();

    System.out.println("Transmisão Avancada");
    AdvancedLive advancedLive = new AdvancedLive(platform);
    advancedLive.broadCasting();
    advancedLive.comments();
    advancedLive.subtitles();
    advancedLive.result();
  }

  public static void record(Platform platform) {
    RecordLive recordLive = new RecordLive(platform);
    recordLive.recordLive();
  }
}
