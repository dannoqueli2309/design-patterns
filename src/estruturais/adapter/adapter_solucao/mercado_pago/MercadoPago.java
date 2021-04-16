package  adapter.adapter_solucao.mercado_pago;

import  adapter.adapter_solucao.utils.Token;

public class MercadoPago{

  public Token authToken() {
    return new Token();
  }
  public void sendPaymentMercadoLivre() {
    System.out.println("Enviando o pagamento para o mercado pago");
  }
  public void receivePaymentMercadoLivre() {
    System.out.println("Recebendo pagamento para o mercado pago");
  }
}
