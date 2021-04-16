package    strategy;

public class FormatoPosicional implements ArrayFormata {

  @Override
  public void mostrar(int[] array) {
    for (int n = 0; n < array.length; n++) {
      System.out.println("Array [" + n + "] = " + array[n]);
    }
  }
}
