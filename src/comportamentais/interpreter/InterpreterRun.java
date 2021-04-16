package    interpreter;

public class InterpreterRun {

  public Expressao carregarAutores(String autor1, String autor2) {
    return new ExpressaoOu(new ExpressaoFinal(autor1), new ExpressaoFinal(autor2));

  }

  public Expressao carregarLinguagem(String pessoa) {
    return new ExpressaoE(new ExpressaoFinal(pessoa),
        new ExpressaoFinal("Java"));

  }

  public static void main(String[] args) {
    new InterpreterRun().verificar();
  }

  public void verificar() {
    Expressao autores = carregarAutores("Fernando", "Anselmo");
    Expressao conheciento = carregarLinguagem("Fernando");

    System.out.println("Fernando foi o autor deste curso? "+autores.entender("Fernando Autor"));
    System.out.println("Fernando sabe java? "+conheciento.entender("Fernando Java"));
  }
}
