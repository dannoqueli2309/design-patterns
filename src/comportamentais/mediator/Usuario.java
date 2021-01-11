package comportamentais.mediator;

public class Usuario {

  private String nome;

  public Usuario(String nome) {
    this.nome = nome;
  }

  public void enviarMens(String mens) {
    SalaChat.show(this, mens);
  }

  @Override
  public String toString() {
    return "Usuario{" +
        "nome='" + nome + '\'' +
        '}';
  }
}
