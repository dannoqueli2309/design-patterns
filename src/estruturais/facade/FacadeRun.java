package estruturais.facade;

public class FacadeRun {

  private RegraDeNegocioFacade regraDeNegocioFacade = new RegraDeNegocioFacade();

  public static void main(String[] args) {
    new FacadeRun().trabalhar();
  }

  public void trabalhar() {
    regraDeNegocioFacade.comprar(Categoria.NORMAL);
    regraDeNegocioFacade.aluga(Categoria.NORMAL);

    System.out.println(regraDeNegocioFacade);
  }
}
