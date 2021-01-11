package criacionais.prototipe;

public class PrototypeImpl implements Prototype {

  @Override
  public Ovelha duplicar(Ovelha ovelha) {
    return (Ovelha) ovelha.clone();
  }
}
