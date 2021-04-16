package  bridge.bridge_solucao.platfoms;

public class YouTube implements Platform {

  public YouTube() {
    configureRMTP();
    System.out.println("YouTube: Transmissão Iniciada");
  }

  @Override
  public void configureRMTP() {
    authToken();
    System.out.println("YouTube: Conta autorizada");
  }

  @Override
  public void authToken() {
    System.out.println("YouTube: Autorizando aplicação");
  }
}
