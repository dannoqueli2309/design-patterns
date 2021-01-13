package estruturais.adapter.adapter_solucao;

import estruturais.adapter.adapter_solucao.adapters.MercadoLivreAdapter;
import estruturais.adapter.adapter_solucao.mercado_pago.MercadoPago;
import estruturais.adapter.adapter_solucao.paypal.PayPalPayments;

public class AdapterMain {

  public static void main(String[] args) {

    PayPalPayments payment = new MercadoLivreAdapter(new MercadoPago());

    payment.paypalPayment();
    payment.paypalReceive();
  }
}
