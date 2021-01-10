package estruturais.decorator;

public class DecoratorRun {

  public static void main(String[] args) {
    new DecoratorRun().combine();
  }

  public void combine() {
    new ErvilhaVerde(new ErvilhaVermelha()).combinar();
    new ErvilhaAmarela(new ErvilhaVerde()).combinar();
  }
}
