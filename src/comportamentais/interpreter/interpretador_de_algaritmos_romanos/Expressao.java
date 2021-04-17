package interpreter.interpretador_de_algaritmos_romanos;

public abstract class Expressao {
    public void interpreta(Contexto contexto) {
        if (contexto.getInput().length() == 0) return;

        if (contexto.getInput().startsWith(nove())) {
            contexto.setOutput(contexto.getOutput() + (9 * multiplicador()));
            contexto.setInput(contexto.getInput().substring(2));
        } else if (contexto.getInput().startsWith(quatro())) {
            contexto.setOutput(contexto.getOutput() + (4 * multiplicador()));
            contexto.setInput(contexto.getInput().substring(2));
        } else if (contexto.getInput().startsWith(cinco())) {
            contexto.setOutput(contexto.getOutput() + (5 * multiplicador()));
            contexto.setInput(contexto.getInput().substring(1));
        }

        while (contexto.getInput().startsWith(um())) {
            contexto.setOutput(contexto.getOutput()+ (1*multiplicador()));
            contexto.setInput(contexto.getInput().substring(1));
        }
    }

    public abstract String um();

    public abstract String quatro();

    public abstract String cinco();

    public abstract String nove();

    public abstract int multiplicador();
}
