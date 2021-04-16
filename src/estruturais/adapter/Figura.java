package  adapter;

public class Figura implements Vector {

  private int posX, posY, largura, altura;

  @Override
  public int getPosX() {
    return posX;
  }

  @Override
  public int getPosY() {
    return posY;
  }

  @Override
  public int getLargura() {
    return largura;
  }

  @Override
  public int getAltura() {
    return altura;
  }
}
