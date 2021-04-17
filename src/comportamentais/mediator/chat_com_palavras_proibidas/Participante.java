package mediator.chat_com_palavras_proibidas;

public abstract class Participante {
    private String nome;
    private Mediator mediator;

    public Participante(String nome, Mediator mediator) {
        this.nome = nome;
        this.mediator = mediator;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void enviaMensagem(String destinatario, String mensagem);

    public abstract void receberMensagem(String remetente, String mensagem);

}
