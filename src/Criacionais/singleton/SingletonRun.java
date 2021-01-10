package Criacionais.singleton;

public class SingletonRun {

  public static void main(String[] args) {
    new SingletonRun().criarConta();
  }

  public void criarConta() {
    ContaCorrente c1 = ContaCorrente.newInstance();
    c1.setNumeroConta("123-45");
    System.out.println(c1 + "  " + c1.hashCode());

    ContaCorrente c2 = ContaCorrente.newInstance();
    c2.setNumeroConta("323-35");
    System.out.println(c2 + "  " + c2.hashCode());
  }

}
