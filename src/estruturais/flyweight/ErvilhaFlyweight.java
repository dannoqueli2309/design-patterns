package estruturais.flyweight;

public class ErvilhaFlyweight {

  private Ervilha[] pool = {
      new ErvilhaVerde(),
      new ErvilhaVermelha(),
      new ErvilhaAmarela()
  };

  public void mostrar(Ervilha ervilhaPai) {
    for (int i = 0; i < pool.length; i++) {
      ervilhaPai.setErvilhaPai(pool[i]);
      ervilhaPai.combinar();
    }
  }
}
