package   singleton;

import static java.util.Objects.isNull;

public class ContaCorrente {

  private String numeroConta;
  private static ContaCorrente contaCorrente;

  private ContaCorrente() {

  }

  public static ContaCorrente newInstance() {
    if (isNull(contaCorrente)) {
      contaCorrente = new ContaCorrente();
    }
    return contaCorrente;
  }

  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  @Override
  public String toString() {
    return this.numeroConta;
  }
}
