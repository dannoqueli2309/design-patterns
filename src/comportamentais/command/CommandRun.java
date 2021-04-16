package    command;

import java.util.Scanner;

public class CommandRun {

  private Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new CommandRun().assistir();
  }

  private void assistir() {
    byte opcao = 0;
    ControleRemoto remoto = new ControleRemoto(new Tv());

    do {
      System.out.println("Selecione o comando (0 para sair)");
      System.out.println("1 - Ligar/Desligar");
      System.out.println("2 - Aumentar Volume");
      System.out.println("3 - Abaixar Volume");
      opcao = sc.nextByte();

      switch (opcao) {
        case 1:
          remoto.pressLigDes();
          break;
        case 2:
          remoto.pressAumentarVol();
          break;
        case 3:
          remoto.pressBaixarVol();
          break;
      }
    } while (opcao != 0);
  }

}
