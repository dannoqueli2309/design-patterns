package estruturais.flyweight;

public class ErvilhaVermelha extends ErvilhaDecorator {


  public ErvilhaVermelha() { }

  public ErvilhaVermelha(Ervilha ervilhaPai) {
    super(ervilhaPai);
  }

  public void combinar() {
    super.combinar();
    this.mostrarcor();
  }

  public void mostrarcor() {
    System.out.println("Ervilhas Vermelha");
  }
}
