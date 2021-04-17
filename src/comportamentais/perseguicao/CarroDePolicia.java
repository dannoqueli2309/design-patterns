package perseguicao;

import java.util.Observable;
import java.util.Observer;

public class CarroDePolicia implements Carro, Observer {
    @Override
    public void frente() {
        System.out.println("Vai para a Frente");
    }

    @Override
    public void direita() {
        System.out.println("rapido a Direita");
    }

    @Override
    public void esquerda() {
        System.out.println("mais rapido a Esquerda");
    }

    @Override
    public void para() {
        System.out.println("Paraaaaaaa");
    }

    @Override
    public void update(Observable carro, Object arg) {
        CarroRoubado carroRoubado = (CarroRoubado) carro;
        String acaoDoCarroRoubado = String.valueOf(arg);

        if (acaoDoCarroRoubado.equals("frente")) {
            this.frente();
        } else if (acaoDoCarroRoubado.equals("direita")) {
            this.direita();
        } else if (acaoDoCarroRoubado.equals("esquerda")) {
            this.esquerda();
        } else if (acaoDoCarroRoubado.equals("para")) {
            this.para();
        }

    }
}
