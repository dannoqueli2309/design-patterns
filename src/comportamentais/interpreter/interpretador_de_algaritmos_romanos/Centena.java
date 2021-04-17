package interpreter.interpretador_de_algaritmos_romanos;

public class Centena extends Expressao {

    @Override
    public String um() {
        return "C";
    }

    @Override
    public String quatro() {
        return "CD";
    }

    @Override
    public String cinco() {
        return "D";
    }

    @Override
    public String nove() {
        return "CM";
    }

    @Override
    public int multiplicador() {
        return 100;
    }
}
