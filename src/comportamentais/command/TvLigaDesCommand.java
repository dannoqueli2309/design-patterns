package comportamentais.command;

public class TvLigaDesCommand implements Command {

  private Tv tv;

  public TvLigaDesCommand(Tv tv) {
    this.tv = tv;
  }

  @Override
  public void executar() {
    this.tv.ligarDesligar();
  }
}
