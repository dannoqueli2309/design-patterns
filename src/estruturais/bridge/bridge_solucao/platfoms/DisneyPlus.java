package  bridge.bridge_solucao.platfoms;

public class DisneyPlus implements Platform {

  public DisneyPlus() {
    configureRMTP();
    System.out.println("DisneyPlus: Transmissão Iniciada");
  }

  @Override
  public void configureRMTP() {
    authToken();
    System.out.println("DisneyPlus: Conta autorizada");
  }

  @Override
  public void authToken() {
    System.out.println("DisneyPlus: Autorizando aplicação");
  }
}
