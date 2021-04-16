package  adapter.adapter_solucao.payoneer;

import  adapter.adapter_solucao.utils.Token;

public interface PayonnerPayment {

  Token authToken();
  void sendPayment();
  void receivePayment();
}
