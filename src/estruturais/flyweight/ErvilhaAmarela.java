package estruturais.flyweight;

public class ErvilhaAmarela extends ErvilhaDecorator {


  public ErvilhaAmarela() {
  }

  public ErvilhaAmarela(Ervilha ervilhaPai) {
    super(ervilhaPai);
  }

  public void combinar() {
    super.combinar();
    this.mostrarcor();
  }

  public void mostrarcor() {
    System.out.println("Ervilhas amarelas");
  }
}
