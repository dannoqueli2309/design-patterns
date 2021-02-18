package criacionais.singleton;
import javax.swing.JFrame;

public class Janela {
  private static Janela janelaIntance = null;

  // Impede que o programador crie uma nova instancia de janela usando o main
  private Janela() {
    new JFrame();
  }

  //  Cria a instancia de janela

  public static Janela getInstance(){
    if(janelaIntance==null){
      janelaIntance = new Janela();
    }
    return janelaIntance;
  }


}
