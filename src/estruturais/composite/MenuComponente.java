package estruturais.composite;

import static java.util.Objects.nonNull;

public abstract class MenuComponente {

  private String link;
  private String descricao;

  public MenuComponente(String link, String descricao) {
    this.link = link;
    this.descricao = descricao;
  }

  @Override
  public String toString() {
    if (nonNull(link)) {
      return "MenuComponente{" +
          "link='" + link + '\'' +
          ", descricao='" + descricao + '\'' +
          '}';
    }
    return descricao;

  }

  public abstract void print();

}
