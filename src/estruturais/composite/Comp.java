package  composite;

public class Comp {

  public static void main(String[] args) {
    new Comp().montarMenu();
  }

  public void montarMenu() {
    Menu parte = new Menu("parte 1");
    parte.add(new MenuItem("Item 1", "Eventos 1"));
    parte.add(new MenuItem("Item 2", "Eventos 2"));

    parte.print();

    Menu parte2 = new Menu("Parte 2");
    parte2.add(new MenuItem("Item 1", "Eventos 3"));
    parte2.add(new MenuItem("Item 2", "Eventos 4"));
    parte2.add(new MenuItem("Item 3", "Eventos 5"));

    parte2.print();

    Menu principal = new Menu("Principal");
    principal.add(new MenuItem("Item 1", "Eventos 3"));
    principal.add(new MenuItem("Item 2", "Eventos 4"));
    principal.add(new MenuItem("Item 3", "Eventos 5"));
    principal.print();
  }

}
