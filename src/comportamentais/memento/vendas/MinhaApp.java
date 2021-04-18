package memento.vendas;

public class MinhaApp {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("João", 1000.00);
        System.out.println(vendedor.getNome() + " - Total de Vendas: " + vendedor.getTotalVendas() + "\n");

        VendasMemory memory = new VendasMemory();
        memory.setMemento(vendedor.createMemento());

        vendedor.setNome("Pedro");
        vendedor.setTotalVendas(5000.0);
        System.out.println(vendedor.getNome() + " Total de vendas: " + vendedor.getTotalVendas() + "\n");

        vendedor.retoreMemento(memory.getMemento());
        System.out.println(vendedor.getNome() + " - Total de vendas: " + vendedor.getTotalVendas() + "\n");

    }
}