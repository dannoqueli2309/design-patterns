package  composite;

public class MenuItem extends MenuComponente {

  public MenuItem(String link, String descricao) {
    super(link, descricao);
  }

  public void print() {
    System.out.println(super.toString());
  }

}
