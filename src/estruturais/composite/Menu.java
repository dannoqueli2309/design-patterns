package estruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponente {

  private List<MenuComponente> componentes;

  public Menu(String descricao) {
    super(null, descricao);
    this.componentes = new ArrayList<MenuComponente>();
  }

  public void add(MenuComponente componente) {
    componentes.add(componente);
  }

  @Override
  public void print() {
    System.out.println(">>" + super.toString());
    componentes.forEach(MenuComponente::print);
  }

}
