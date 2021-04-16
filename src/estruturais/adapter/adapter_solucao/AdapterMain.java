package  adapter.adapter_solucao;

import  adapter.adapter_solucao.adapters.MercadoLivreAdapter;
import  adapter.adapter_solucao.mercado_pago.MercadoPago;
import  adapter.adapter_solucao.paypal.PayPalPayments;

public class AdapterMain {

  public static void main(String[] args) {

    PayPalPayments payment = new MercadoLivreAdapter(new MercadoPago());

    payment.paypalPayment();
    payment.paypalReceive();
  }
}
