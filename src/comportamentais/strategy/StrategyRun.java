package    strategy;

public class StrategyRun {

  public static void main(String[] args) {
    new StrategyRun().padronizar();
  }

  public void padronizar() {
    MeuArray meuArray = new MeuArray(10);
    meuArray.addValorEmPos(6, 1);
    meuArray.addValorEmPos(8, 0);
    meuArray.addValorEmPos(1, 4);
    meuArray.addValorEmPos(7, 9);

    System.out.println("Formata Corrente:");
    meuArray.setEstrategia(new FormatoPadrao());

    System.out.println("Formata Posicional:");
    meuArray.setEstrategia(new FormatoPosicional());
  }
}
