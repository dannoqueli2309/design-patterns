package memento.vendas;

public class Vendedor {
    private String nome = "";
    private double totalVendas;

    public Vendedor(String nome, double totalVendas) {
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

    public Memento createMemento() {
        return new Memento(this.nome, this.totalVendas);
    }

    public void retoreMemento(Memento memento) {
        this.nome = memento.getNome();
        this.totalVendas = memento.getTotalVendas();
    }
}
