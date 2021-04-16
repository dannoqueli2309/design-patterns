package    interpreter;

public class ExpressaoOu implements Expressao {

  private Expressao exp1 = null;
  private Expressao exp2 = null;

  public ExpressaoOu(Expressao exp1, Expressao exp2) {
    this.exp1 = exp1;
    this.exp2 = exp2;
  }

  @Override
  public boolean entender(String contexto) {
    return exp1.entender(contexto)
        || exp2.entender(contexto);
  }
}
