package estruturais.proxy;

public class SerSupremoReal implements SerSupremo {

  @Override
  public String responder(String pergunta) {
    return "Por que 42 é a resposta para tudo";
  }
}
