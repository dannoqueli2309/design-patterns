package perseguicao;

public class MinhaApp {
    public static void main(String[] args) {
        CarroRoubado carroRoubado = new CarroRoubado();

        CarroDePolicia carroDePolicia = new CarroDePolicia();
        carroRoubado.addObserver(carroDePolicia);

        carroRoubado.frente();
        carroRoubado.direita();
        carroRoubado.esquerda();
        carroRoubado.para();

    }
}
