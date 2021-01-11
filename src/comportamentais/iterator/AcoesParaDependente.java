package comportamentais.iterator;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class AcoesParaDependente {

  private Dependente[] lsDependente;

  public void adicionar(Dependente dependente) {
    byte pos = 0;
    if (isNull(lsDependente)) {
      lsDependente = new Dependente[1];
    } else {
      IteratorImpl<Dependente> backup = new IteratorImpl<>(lsDependente);
      lsDependente = new Dependente[lsDependente.length + 1];

      for (backup.first(); !backup.isDone(); backup.next()) {
        lsDependente[backup.getIndex()] = backup.currentItem();
      }
      pos = backup.getLenght();
    }
    lsDependente[pos] = dependente;
  }

  public void remover(byte posicao) {
    if (lsDependente.length == 1) {
      lsDependente = null;
    } else {
      IteratorImpl<Dependente> backup = new IteratorImpl<>(lsDependente);
      lsDependente = new Dependente[lsDependente.length - 1];
      byte j = 0;

      for (backup.first(); !backup.isDone(); backup.next()) {
        if (backup.getIndex() != posicao) {
          lsDependente[j++] = backup.currentItem();
        }
      }
    }
  }

  public void listar() {
    if (nonNull(lsDependente)) {
      IteratorImpl<Dependente> backup = new IteratorImpl<>(lsDependente);
      System.out.println("Dependentes de funcionarios:");
      for (backup.first(); !backup.isDone(); backup.next()) {
        System.out.println("-" + backup.currentItem());
      }
    }
  }
}
