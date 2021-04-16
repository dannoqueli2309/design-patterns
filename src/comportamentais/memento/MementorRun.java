package    memento;

/**
 * O Padrão mementor Serve para guardar estado do objeto para que seja possivel voltar para o objeto
 * anterior
 */
public class MementorRun {

  public static void main(String[] args) {
    new MementorRun().bolsa();
  }

  public void bolsa() {
    Acao padrao = new Acao("Patterns int");

    padrao.setValor(3.0f);
    System.out.println(padrao);

    padrao.setValor(8.0f);
    System.out.println(padrao);

    padrao.setValor(25.0f);
    System.out.println(padrao);

    padrao.undo();
    System.out.println(padrao);

    padrao.undo();
    System.out.println(padrao);

    padrao.undo();
    System.out.println(padrao);
  }
}
