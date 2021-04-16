package  bridge.bridge_solucao.platfoms;

public class Facebook implements Platform {

  public Facebook() {
    configureRMTP();
    System.out.println("Facebook: Trasmissão iniciada");
  }

  @Override
  public void configureRMTP() {
    authToken();
    System.out.println("Facebook: Conta autorizada");
  }

  @Override
  public void authToken() {
    System.out.println("Facebook: Autorizando aplicação");
  }

}
