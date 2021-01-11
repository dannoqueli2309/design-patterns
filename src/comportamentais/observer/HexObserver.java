package comportamentais.observer;

public class HexObserver extends Observer {

  public HexObserver(Numero num) {
    this.num = num;
    this.num.add(this);
  }

  @Override
  public void notificar() {
    System.out
        .println(num.hashCode() + " em hexadecimal "
            + Integer.toHexString(this.num.hashCode()));
  }
}
