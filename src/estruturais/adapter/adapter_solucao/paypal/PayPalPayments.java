package estruturais.adapter.adapter_solucao.paypal;

import estruturais.adapter.adapter_solucao.utils.Token;

public interface PayPalPayments {
  Token authToken();
  void paypalPayment();
  void paypalReceive();
}
