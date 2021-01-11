package comportamentais.observer;

public class OctalObserver extends Observer {

  public OctalObserver(Numero num) {
    this.num = num;
    this.num.add(this);
  }

  @Override
  public void notificar() {
    System.out
        .println(num.hashCode() + " em Octal "
            + Integer.toOctalString(this.num.hashCode()));
  }
}
