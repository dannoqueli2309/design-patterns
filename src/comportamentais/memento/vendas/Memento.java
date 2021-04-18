package memento.vendas;

public class Memento {
    private String nome;
    private double totalVendas;

    public Memento(String nome, double totalVendas) {
        this.nome = nome;
        this.totalVendas = totalVendas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
}
