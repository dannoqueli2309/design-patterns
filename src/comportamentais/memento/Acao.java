package comportamentais.memento;

import java.util.ArrayList;
import java.util.List;

public class Acao {

  private String empresa;
  private float valor;
  private List<AcaoMementor> memoria = new ArrayList<>();

  public Acao(String empresa) {
    this.empresa = empresa;
  }

  @Override
  public String toString() {
    return "Acao{" +
        "empresa='" + empresa + '\'' +
        ", valor=" + valor +
        '}';
  }

  public void setValor(float valor) {
    this.valor = valor;
    memoria.add(new AcaoMementor(valor));
  }

  public void undo() {
    if (memoria.size() > 1) {
      memoria.remove(memoria.size() - 1);

      this.valor = memoria
          .get(memoria.size() - 1)
          .getState();
    }
  }

}
