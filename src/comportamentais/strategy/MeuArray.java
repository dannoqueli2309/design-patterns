package comportamentais.strategy;

public class MeuArray {

  private int[] array;
  private int tam;
  private ArrayFormata arrayFormata;

  public MeuArray(int tam) {
    this.array = new int[tam];
  }

  public void addValorEmPos(int valor, int pos) {
    array[pos] = valor;
  }

  public void setEstrategia(ArrayFormata estrategia) {
    arrayFormata = estrategia;
    arrayFormata.mostrar(this.array);
  }
}
