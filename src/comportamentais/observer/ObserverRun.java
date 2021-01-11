package comportamentais.observer;

// O Padão observer serve para avisar para um determinado objeto mudou de estado
public class ObserverRun {

  public static void main(String[] args) {
    new ObserverRun().converter();
  }

  public void converter() {
    Numero num = new Numero();
    new HexObserver(num);
    new OctalObserver(num);
    num.setValor(15);
    num.setValor(30);
    num.setValor(12);
  }
}
