package  adapter.adapter_solucao.paypal;

import  adapter.adapter_solucao.utils.Token;

public class PayPal implements PayPalPayments {

  private Token token;

  @Override
  public Token authToken() {
    return new Token();
  }

  @Override
  public void paypalPayment() {
    this.token = authToken();
    System.out.println("Enviando pagamentos com paypal");
  }

  @Override
  public void paypalReceive() {
    System.out.println("Enviando pagamentos via paypal");
  }
}
