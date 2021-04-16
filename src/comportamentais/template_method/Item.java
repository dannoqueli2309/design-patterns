package    template_method;

public abstract class Item {

  public final boolean remover(int qtd) {

    if (!validaQtd(qtd)) {
      System.out.println("Impedir remover.");
      return false;
    }

    if (getEstoque() >= qtd) {
      descontaEstoque(qtd);
      System.out.println("Itens remover.");
      return true;
    }

    System.out.println("Impedir remover");
    return false;
  }

  protected abstract boolean validaQtd(int qtd);
  protected abstract int getEstoque();
  protected abstract void descontaEstoque(int qtd);

}
