package criacionais.prototipe;

public class Ovelha implements Cloneable {

  private String nome;

  public Ovelha(String nome) {
    this.nome = nome;
  }

  public Object clone() {
    Object object = null;
    try {
      object = super.clone();
    } catch (CloneNotSupportedException cloneNotSupporteed) {
      System.out.println("Erro" + cloneNotSupporteed.getMessage());
    }
    return object;
  }

  @Override
  public String toString() {
    return "nome:" + this.nome;
  }
}
