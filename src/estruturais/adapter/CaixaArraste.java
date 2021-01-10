package estruturais.adapter;

public class CaixaArraste {

  public CaixaArraste(Coordenada topoEsq, Coordenada rodapeDir) {
    this.topoEsq = topoEsq;
    this.rodapeDir = rodapeDir;
  }

  public void setTopoEsq(Coordenada topoEsq) {
    this.topoEsq = topoEsq;
  }

  public void setRodapeDir(Coordenada rodapeDir) {
    this.rodapeDir = rodapeDir;
  }

  private Coordenada topoEsq, rodapeDir;

  public Coordenada getTopoEsq() {
    return topoEsq;
  }

  public Coordenada getRodapeDir() {
    return rodapeDir;
  }

}
