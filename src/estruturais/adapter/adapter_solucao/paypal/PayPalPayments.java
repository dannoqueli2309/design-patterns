package  adapter.adapter_solucao.paypal;

import  adapter.adapter_solucao.utils.Token;

public interface PayPalPayments {
  Token authToken();
  void paypalPayment();
  void paypalReceive();
}
