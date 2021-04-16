package    chain_of_responsability.chain_of_responsability_solucao.middlewares;

public class CheckRolePermission extends Middleware {

  @Override
  public boolean check(String email, String password) {
    if (email.equals("master@hcode.com.br")) {
      System.out.println("Bem vindo Administrador");
      return true;
    } else {
      System.out.println("Bem vindo");
      return checkNext(email, password);
    }
  }
}
