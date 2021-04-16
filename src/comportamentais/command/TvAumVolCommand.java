package    command;

public class TvAumVolCommand implements Command {

  private Tv tv;

  public TvAumVolCommand(Tv tv) {
    this.tv = tv;
  }

  @Override
  public void executar() {
    this.tv.aumentarVolume();
  }
}
