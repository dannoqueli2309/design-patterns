package Criacionais.abstract_facory;

abstract class Pet{
  private String nome;

  public Pet(String nome){
    this.nome = nome;
  }
  public String toString(){
    return nome;
  }
}
