package abstract_facory;

class FabricaCompanhia implements Modelo{
  public Cachorro getCachorro(){
    return new Shitzu();
  }

  public Gato getGato(){
    return new Persa();
  }

}
