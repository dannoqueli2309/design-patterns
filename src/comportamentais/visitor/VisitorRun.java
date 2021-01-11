package comportamentais.visitor;

public class VisitorRun {

  public static void main(String[] args) {
    ParteComp computador = new Cpu();
    computador.adicionar(new ShowVisitor());
  }
}
