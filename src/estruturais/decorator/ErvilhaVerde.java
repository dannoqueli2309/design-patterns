package estruturais.decorator;

public class ErvilhaVerde extends ErvilhaDecorator {


  public ErvilhaVerde() {
  }

  public ErvilhaVerde(Ervilha ervilhaPai) {
    super(ervilhaPai);
  }

  public void combinar() {
    super.combinar();
    this.mostrarcor();
  }

  public void mostrarcor() {
    System.out.println("Ervilhas Verde");
  }
}
