package  decorator;

public class ErvilhaDecorator implements Ervilha {

  private Ervilha ervilhapai;

  public ErvilhaDecorator() {
  }


  public ErvilhaDecorator(Ervilha ervilhaPai) {
    this.setErvilhaPai(ervilhaPai);
  }

  public void combinar() {
    if (ervilhapai != null) {
      ervilhapai.combinar();
      System.out.println("x");
    } else {
      System.out.println();
    }
  }

  @Override
  public void setErvilhaPai(Ervilha ervilhaPai) {
    this.ervilhapai = ervilhaPai;
  }

}
