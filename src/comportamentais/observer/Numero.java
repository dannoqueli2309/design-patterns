package    observer;

import java.util.ArrayList;
import java.util.List;

public class Numero {

  private List<Observer> observadores = new ArrayList<>();
  private int valor;

  public int hashCode() {
    return this.valor;
  }

  public void setValor(int valor) {
    this.valor = valor;
    for (Observer observer : observadores) {
      observer.notificar();
    }
  }

  public void add(Observer observer) {
    observadores.add(observer);
  }
}
