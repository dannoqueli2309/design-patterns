package estruturais.adapter.adapter_solucao.mercado_pago;

import estruturais.adapter.adapter_solucao.utils.Token;

public interface MercadoPagoPayment {
  Token authToken();
  void sendPaymentMercadoLivre();
  void receivePaymentMercadoLivre();
}
