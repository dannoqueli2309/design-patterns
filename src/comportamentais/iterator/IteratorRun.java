package comportamentais.iterator;

/// O iterator ajuda a percorrer os laços de repetição de forma mais segura e Controlada
public class IteratorRun {

  public static void main(String[] args) {
    AcoesParaDependente acoesParaDependente = new AcoesParaDependente();
    acoesParaDependente.adicionar(new Dependente("Moraci", GrauParentesco.PAI));
    acoesParaDependente.adicionar(new Dependente("Diana", GrauParentesco.FILHO));

    acoesParaDependente.listar();
  }

}
