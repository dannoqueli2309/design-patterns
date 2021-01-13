package estruturais.adapter.adapter_solucao.mercado_pago;

import estruturais.adapter.adapter_solucao.utils.Token;

public class MercadoPago implements MercadoPagoPayment {

  @Override
  public Token authToken() {
    return new Token();
  }

  @Override
  public void sendPaymentMercadoLivre() {
    System.out.println("Enviando o pagamento para o mercado pago");
  }

  @Override
  public void receivePaymentMercadoLivre() {
    System.out.println("Recebendo pagamento para o mercado pago");
  }
}
