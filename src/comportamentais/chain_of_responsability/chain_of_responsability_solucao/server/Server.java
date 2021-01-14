package comportamentais.chain_of_responsability.chain_of_responsability_solucao.server;

import comportamentais.chain_of_responsability.chain_of_responsability_solucao.middlewares.Middleware;
import java.util.HashMap;
import java.util.Map;

public class Server {

  private Map<String, String> users = new HashMap<>();
  private Middleware middleware;

  public void setMiddleware(Middleware middleware) {
    this.middleware = middleware;
  }

  public boolean login(String email, String password) {
    if (middleware.check(email, password)) {
      System.out.println("Usuario autenticado");
      System.out.println("Seja bem vindo");
      return true;
    }
    return false;
  }

  public void registerUser(String email, String password) {
    users.put(email, password);
  }

  public boolean hasEmail(String email) {
    return users.containsKey(email);
  }

  public boolean isValidPassword(String email, String password) {
    return this.users.get(email).equals(password);
  }
}
