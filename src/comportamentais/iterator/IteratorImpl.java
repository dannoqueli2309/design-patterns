package    iterator;

public class IteratorImpl<T> implements Iterator {

  private T[] itens;
  private int index;

  public IteratorImpl(T[] itens) {
    this.itens = itens;
  }

  @Override
  public void first() {
    index = 0;
  }

  @Override
  public void next() {
    index++;
  }

  @Override
  public boolean isDone() {
    return index == itens.length;
  }

  @Override
  public T currentItem() {
    return itens[index];
  }

  @Override
  public int getIndex() {
    return index;
  }

  @Override
  public byte getLenght() {
    return (byte) itens.length;
  }
}
