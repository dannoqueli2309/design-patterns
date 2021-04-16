package   abstract_facory;

class FabricaGuarda implements Modelo{
  public Cachorro getCachorro(){
    return new Pastor();
  }

  public Gato getGato(){
    return new RagDoll();
  }

}
