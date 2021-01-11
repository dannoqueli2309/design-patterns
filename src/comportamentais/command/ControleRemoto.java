package comportamentais.command;

public class ControleRemoto {

  private Command btLigDes, btmAumVol, btmAbxVol;

  public ControleRemoto(Tv tv) {
    this.btLigDes = new TvLigaDesCommand(tv);
    this.btmAumVol = new TvAumVolCommand(tv);
    this.btmAbxVol = new TvAbxVolCommand(tv);
  }

  public void pressLigDes() {
    this.btLigDes.executar();
  }

  public void pressAumentarVol() {
    this.btmAumVol.executar();
  }

  public void pressBaixarVol() {
    this.btmAbxVol.executar();
  }

}
