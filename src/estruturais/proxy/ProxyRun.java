package estruturais.proxy;

public class ProxyRun {

  public static void main(String[] args) {
    new ProxyRun().problema();
  }

  public void problema() {
    SerSupremo serSupremo = new Intermediario();
    /// Proxy
    System.out.println(serSupremo.responder("Qual o sentido da vida"));
  }
}
