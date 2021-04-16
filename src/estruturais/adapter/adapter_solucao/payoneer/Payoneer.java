package  adapter.adapter_solucao.payoneer;

import  adapter.adapter_solucao.paypal.PayPalPayments;
import  adapter.adapter_solucao.utils.Token;

public class Payoneer implements PayonnerPayment {

  @Override
  public Token authToken() {
    return new Token();
  }

  @Override
  public void receivePayment() {
    System.out.println("Enviando pagamentos via payoneer");
  }

  @Override
  public void sendPayment() {
    System.out.println("Recebendo pagamento via payoneer");
  }
}
