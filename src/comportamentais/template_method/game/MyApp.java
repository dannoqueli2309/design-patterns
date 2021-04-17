package template_method.game;

public class MyApp {
    public static void main(String[] args) {
        Game game = new Basquete();
        game.play();

        game = new Futebol();
        game.play();
    }
}
