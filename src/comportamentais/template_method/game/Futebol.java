package template_method.game;

public class Futebol extends Game{
    @Override
    public void initialize() {
        System.out.println("Vamos iniciar o Fut");
    }

    @Override
    public void startPlay() {
        System.out.println("Bola em campo");
    }

    @Override
    public void endPlay() {

        System.out.println("Fim de Jogo. Bora pro bar");
    }
}
