package    command;

public class Tv {

  private boolean ligada = false;
  private byte volume = 0;

  public void ligarDesligar() {
    if (this.ligada = !ligada) {
      System.out.println("Tv Ligada.");
    } else {
      System.out.println("Tv Desligada.");
    }
  }

  public void aumentarVolume() {
    if (this.ligada) {
      if (this.volume < 10) {
        volume++;
      }
      System.out.println("Volume da Tv" + volume);
    } else {
      System.out.println("Liguei a Tv");
    }
  }

  public void abaixarVolume() {
    if (this.ligada) {
      if (this.volume > 0) {
        volume--;
      }
      System.out.println("Volume da Tv" + volume);
    } else {
      System.out.println("Liguei a Tv");
    }
  }

}
