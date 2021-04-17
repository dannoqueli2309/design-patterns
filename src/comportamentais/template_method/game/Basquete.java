package template_method.game;

public class Basquete extends Game {
    @Override
    public void initialize() {
        System.out.println("Basquete Game initialize ");
    }

    @Override
    public void startPlay() {
        System.out.println("Bora bola na cesta");
    }

    @Override
    public void endPlay() {

        System.out.println("Fim do Jogo. Bora");
    }
}
