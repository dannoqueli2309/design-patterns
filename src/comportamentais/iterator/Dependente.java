package    iterator;

public class Dependente {

  private String nome;
  private GrauParentesco grauParentesco;

  public Dependente(String nome, GrauParentesco grauParentesco) {
    this.nome = nome;
    this.grauParentesco = grauParentesco;
  }

  public String getNome() {
    return nome;
  }

  public String getGrauParentesco() {
    switch (grauParentesco) {
      case CONJUGE:
        return "Conjuge";
      case FILHO:
        return "Filho";
      case PAI:
        return "Pai";
    }
    return null;
  }

  @Override
  public String toString() {
    return "Dependente{" +
        "nome='" + nome + '\'' +
        ", grauParentesco=" + grauParentesco +
        '}';
  }
}
