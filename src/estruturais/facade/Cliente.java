package estruturais.facade;

public class Cliente {

  private short compra;
  private short alugar;

  public void addCompra() {
    this.compra++;
  }

  public void addAlugar() {
    this.alugar++;
  }

  @Override
  public String toString() {
    return "Cliente{" +
        "compra=" + compra +
        ", alugar=" + alugar +
        '}';
  }
}
