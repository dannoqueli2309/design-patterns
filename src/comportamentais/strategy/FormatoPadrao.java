package    strategy;

public class FormatoPadrao implements ArrayFormata {

  @Override
  public void mostrar(int[] array) {
    System.out.println("{");
    for (int n = 0; n < array.length - 1; n++) {
      System.out.println(array[n] + ", ");
    }
    System.out.println(array[array.length - 1] + "}");
  }
}
