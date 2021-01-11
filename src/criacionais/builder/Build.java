package criacionais.builder;

public class Build {

  public static void main(String[] args) {
    new Build().executar();
  }

  public void executar(){
    Montadora montadora = new Montadora();
    Veiculo carro1 = montadora.montar('f',"TesteRosa");
    Veiculo carro2 = montadora.montar('j',"Renegade");

    System.out.println(carro1.nome);
    System.out.println(carro2.nome);
  }
}
