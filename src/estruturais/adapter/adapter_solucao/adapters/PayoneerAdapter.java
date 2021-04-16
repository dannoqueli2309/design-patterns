package  adapter.adapter_solucao.adapters;

import  adapter.adapter_solucao.payoneer.Payoneer;
import  adapter.adapter_solucao.paypal.PayPalPayments;
import  adapter.adapter_solucao.utils.Token;

public class PayoneerAdapter implements PayPalPayments {

  private Token token;
  private Payoneer payoneer;

  public PayoneerAdapter(Payoneer payoneer) {
    this.payoneer = payoneer;
    System.out.println("Adaptando o payoneer para os metodos paypal" + this.payoneer);
  }

  @Override
  public Token authToken() {
    return new Token();
  }

  @Override
  public void paypalPayment() {
    this.payoneer.sendPayment();
  }

  @Override
  public void paypalReceive() {
    this.payoneer.receivePayment();
  }
}
