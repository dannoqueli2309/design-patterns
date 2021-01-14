package comportamentais.chain_of_responsability.chain_of_responsability_solucao;

import comportamentais.chain_of_responsability.chain_of_responsability_solucao.middlewares.CheckRolePermission;
import comportamentais.chain_of_responsability.chain_of_responsability_solucao.middlewares.CheckUserMiddleware;
import comportamentais.chain_of_responsability.chain_of_responsability_solucao.middlewares.Middleware;
import comportamentais.chain_of_responsability.chain_of_responsability_solucao.server.Server;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChainOfResponsibilityMain {

  private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

  private static Server server;

  public static void main(String[] args) throws IOException {
    init();

    boolean done;
    do {
      System.out.println("Digite o e-mail:");
      String email = reader.readLine();
      System.out.println("Digite sua senha");
      String password = reader.readLine();
      done = server.login(email, password);
    } while (!done);
  }

  public static void init() {
    server = new Server();
    server.registerUser("master@hcode.com.br", "9798jkkjkjhjiuy98798");
    server.registerUser("user@hcode.com.br", "123456");

    Middleware middleware = new CheckUserMiddleware(server);
    middleware.linkWith(new CheckRolePermission());

    server.setMiddleware(middleware);
  }
}
