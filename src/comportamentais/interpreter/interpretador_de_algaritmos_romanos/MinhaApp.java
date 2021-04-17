package interpreter.interpretador_de_algaritmos_romanos;

import java.util.ArrayList;
import java.util.List;

public class MinhaApp {
    public static void main(String[] args) {
        String romano = "MCMXCVI";
        Contexto contexto = new Contexto(romano);

        List<Expressao> tree = new ArrayList<Expressao>();
        tree.add(new Milhar());
        tree.add(new Centena());
        tree.add(new Dezena());
        tree.add(new Unidade());

        tree.forEach(expressao -> expressao.interpreta(contexto));
        System.out.println(contexto.getOutput());
    }
}
