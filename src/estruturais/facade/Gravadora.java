package  facade;

public class Gravadora {

  private float repasse;

  public void setRepasse(float repasse) {
    this.repasse = repasse;
  }

  @Override
  public String toString() {
    return "Gravadora{" +
        "repasse=" + repasse +
        '}';
  }
}
