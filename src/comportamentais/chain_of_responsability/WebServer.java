package comportamentais.chain_of_responsability;

import static java.util.Objects.nonNull;

public class WebServer {

  private WebServer next;
  private String nome;

  public WebServer(String nome) {
    this.nome = nome;
  }

  public void add(WebServer nextWebService) {
    if (nonNull(this.next)) {
      this.next.add(nextWebService);
    } else {
      next = nextWebService;
    }
  }

  public void wrapAround(WebServer firstWebService) {
    if (nonNull(this.next)) {
      next.wrapAround(firstWebService);
    } else {
      next = firstWebService;
    }
  }

  public void handle(Rede rede) {
    if ((int) (Math.random() * 4) % 2 == 0) {
      System.out.println("Webservice conectado " + rede.tipoRede() + "em" + next);
    } else {
      System.out.println("Webservice" + next + " Ocupado ...Tentar outro...");
      next.handle(rede);
    }
  }

  @Override
  public String toString() {
    return "WebServer{" +
        "nome='" + nome + '\'' +
        '}';
  }
}
