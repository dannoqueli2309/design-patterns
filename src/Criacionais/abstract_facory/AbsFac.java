package Criacionais.abstract_facory;

import java.util.Scanner;

public class AbsFac {

  private Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new AbsFac().executar();
  }

  public void executar() {
    System.out.println("1- Companhia ou 2-Guarda");
    byte opc = sc.nextByte();
    Modelo modelo = null;
    switch (opc) {
      case 1:
        modelo = new FabricaCompanhia();
        break;
      case 2:
        modelo = new FabricaGuarda();
        break;
    }

    // o usuario não sabe quem é o guarda da companhia ou de guarda
    // ele apenas chama a fabrica e a mesma cria para ele o objeto desejado
    System.out.println("cachorro: " + modelo.getCachorro());
    System.out.println("gato: " + modelo.getGato());

  }
}
