package comportamentais.state;

public class StateRun {

  public static void main(String[] args) {
    new StateRun().procederVariacao();
  }

  public void procederVariacao() {
    Acao padrao = new Acao("Patterns Inc.");

    padrao.setValor(1.0f);
    System.out.println(padrao);

    padrao.setValor(4.0f);
    System.out.println(padrao);

    padrao.setValor(30.5f);
    System.out.println(padrao);

    padrao.setValor(1.0f);
    System.out.println(padrao);
  }

}
