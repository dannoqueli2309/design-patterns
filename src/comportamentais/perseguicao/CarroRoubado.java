package perseguicao;

import java.util.Observable;

public class CarroRoubado extends Observable implements Carro{

    private String acao;

    @Override
    public void frente() {
        acao = "Frente";
        System.out.println("Carro  roubado foi para frente");
        this.mudaEstado();
    }

    @Override
    public void direita() {
        acao = "direita";
        System.out.println("Carro  roubado foi para direita");
        this.mudaEstado();
    }

    @Override
    public void esquerda() {
        acao = "esquerda";
        System.out.println("Carro  roubado foi para esquerda");
        this.mudaEstado();
    }

    @Override
    public void para() {
        acao = "para";
        System.out.println("Carro  roubado parou");
        this.mudaEstado();
    }

    public String getAcao() {
        return acao;
    }

    private void mudaEstado() {
        setChanged();
        notifyObservers(acao);
    }
}
