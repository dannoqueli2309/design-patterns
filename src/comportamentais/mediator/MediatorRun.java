package comportamentais.mediator;

public class MediatorRun {

  public static void main(String[] args) {
    new MediatorRun().abrirSala();
  }

  public void abrirSala() {
    Usuario fernando = new Usuario("Fernando");
    Usuario anselmo = new Usuario("Anselmo");

    fernando.enviarMens("oii, tudo bem ?");

    fernando.enviarMens("Em qual pattern estamos?");

    anselmo.enviarMens("Acho que no 17°");
  }
}
