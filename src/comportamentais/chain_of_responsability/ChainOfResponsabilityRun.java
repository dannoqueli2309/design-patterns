package    chain_of_responsability;

public class ChainOfResponsabilityRun {

  public static void main(String[] args) {
    new ChainOfResponsabilityRun().gerenciar();
  }

  public void gerenciar() {
    WebServer webServer = new WebServer("Ws Principal");
    WebServer primeiro = new WebServer("WS1");
    webServer.add(primeiro);
    webServer.add(new WebServer("WS2"));
    webServer.add(primeiro);

    Rede[] redes = {new Linux(), new Linux(), new Microsoft()};
    for (Rede rede : redes) {
      webServer.handle(rede);
    }
  }
}
