package estruturais.proxy;

public class Intermediario implements SerSupremo {

  private SerSupremo real;

  public Intermediario() {
    this.real = new SerSupremoReal();
  }

  @Override
  public String responder(String pergunta) {
    return real.responder(pergunta);
  }

}
