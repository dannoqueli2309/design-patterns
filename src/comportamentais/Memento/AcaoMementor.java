package comportamentais.Memento;

public class AcaoMementor {

  private float valor;

  public AcaoMementor(float valor) {
    this.valor = valor;
  }
  public float getState(){
    return valor;
  }
}
