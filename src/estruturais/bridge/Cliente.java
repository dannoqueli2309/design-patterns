package  bridge;

public class Cliente {

  public static void main(String[] args) {
    new Cliente().publicar();
  }

  public void publicar() {
    Livro livro = new Livro("Desing Patterns", "GoF");
    System.out.println(livro);
  }
}
