package estruturais.bridge.bridge_solucao.platfoms;

public class TwitchTv implements Platform {

  public TwitchTv() {
    configureRMTP();
    System.out.println("TwitchTv: Transmissão Iniciada");
  }

  @Override
  public void configureRMTP() {
    authToken();
    System.out.println("TwitchTv: Conta autorizada");
  }

  @Override
  public void authToken() {
    System.out.println("TwitchTv: Autorizando aplicação");
  }

}
