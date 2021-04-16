package   prototipe;

public class Proto {

  public static void main(String[] args) {
    new Proto().executar();
  }

  public void executar(){
    Ovelha ovelhaOriginal = new Ovelha("Dolly");
    System.out.println(ovelhaOriginal);

    Ovelha ovelhaClonada = new PrototypeImpl().duplicar(ovelhaOriginal);
    System.out.println(ovelhaClonada);
  }

}
