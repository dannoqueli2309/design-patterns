package estruturais.facade;

public class CD {

  private float preco;

  public CD(Categoria categoria) {
    switch (categoria) {
      case NORMAL:
        preco = 9.99f;
        break;
      case LANCAMENTO:
        preco = 29.99f;
        break;
      case PROMOCIONAL:
        preco = 19.90f;
        break;
    }
  }

  public float getPreco() {
    return preco;
  }
}
