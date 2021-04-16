package adapter.adapter_solucao.adapters;

import  adapter.adapter_solucao.mercado_pago.MercadoPago;
import  adapter.adapter_solucao.paypal.PayPalPayments;
import  adapter.adapter_solucao.utils.Token;

public class MercadoLivreAdapter implements PayPalPayments {

  private MercadoPago mercadoPago;

  public MercadoLivreAdapter(MercadoPago payoneer) {
    this.mercadoPago = payoneer;
    System.out.println("Adaptando o pagemento para Mercado Pago");
  }

  @Override
  public Token authToken() {
    return new Token();
  }

  @Override
  public void paypalPayment() {
    this.mercadoPago.sendPaymentMercadoLivre();
  }

  @Override
  public void paypalReceive() {
    this.mercadoPago.receivePaymentMercadoLivre();
  }
}
