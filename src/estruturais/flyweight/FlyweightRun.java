package estruturais.flyweight;

public class FlyweightRun {

  public static void main(String[] args) {
    new FlyweightRun().combinar();
  }

  public void combinar() {
    ErvilhaFlyweight flyweight = new ErvilhaFlyweight();
    flyweight.mostrar(new ErvilhaVerde());
    flyweight.mostrar(new ErvilhaVermelha());
    flyweight.mostrar(new ErvilhaAmarela());
  }
}
