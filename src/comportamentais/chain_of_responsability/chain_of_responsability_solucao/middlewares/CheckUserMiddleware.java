package comportamentais.chain_of_responsability.chain_of_responsability_solucao.middlewares;

import comportamentais.chain_of_responsability.chain_of_responsability_solucao.server.Server;

public class CheckUserMiddleware extends Middleware {

  private Server server;

  public CheckUserMiddleware(
      Server server) {
    this.server = server;
  }


  @Override
  public boolean check(String email, String password) {
    if (!server.hasEmail(email)) {
      System.out.println("Email invalido");
      return false;
    }

    if (!server.isValidPassword(email, password)) {
      System.out.println("Email ou senha invalidos");
      return false;
    }
    return checkNext(email, password);
  }

}
