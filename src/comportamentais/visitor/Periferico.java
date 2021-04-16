package    visitor;

public class Periferico implements ParteComp {

  private String nome;

  public Periferico(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return this.nome;
  }

  public void adicionar(ParteVisitor parteVisitor) {
    parteVisitor.visit(this);
  }
}
