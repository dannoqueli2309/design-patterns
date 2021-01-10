package estruturais.adapter;

public class CaixaArrasteAdapter implements Vector {

  private CaixaArraste caixaArraste = new CaixaArraste(new Coordenada(20, 80),
      new Coordenada(50, 30));

  @Override
  public int getPosX() {
    Coordenada coordenada = caixaArraste.getTopoEsq();
    return coordenada.getX();
  }

  @Override
  public int getPosY() {
    Coordenada coordenada = caixaArraste.getTopoEsq();
    return coordenada.getY();

  }

  @Override
  public int getLargura() {
    Coordenada coordenadaTopoDireita = caixaArraste.getTopoEsq();
    Coordenada coordenadaRodapeDireito = caixaArraste.getRodapeDir();
    return coordenadaTopoDireita.getX() - coordenadaRodapeDireito.getX();
  }

  @Override
  public int getAltura() {
    Coordenada coordenadaTopoDireita = caixaArraste.getTopoEsq();
    Coordenada coordenadaRodapeDireito = caixaArraste.getRodapeDir();
    return coordenadaTopoDireita.getY() - coordenadaRodapeDireito.getY();
  }

  public static void main(String[] args) {
    CaixaArrasteAdapter adapter = new CaixaArrasteAdapter();
    System.out.println("Altura" + adapter.getAltura());
    System.out.println("largura" + adapter.getLargura());
    System.out.println("position x" + adapter.getPosX());
    System.out.println("position y" + adapter.getPosY());
  }
}
