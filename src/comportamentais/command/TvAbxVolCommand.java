package    command;

public class TvAbxVolCommand implements Command {

  private Tv tv;

  public TvAbxVolCommand(Tv tv) {
    this.tv = tv;
  }

  @Override
  public void executar() {
    this.tv.abaixarVolume();
  }
}
