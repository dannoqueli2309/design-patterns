package mediator.chat_com_palavras_proibidas;

public class ParticipanteImpl extends Participante {

    public ParticipanteImpl(String nome, Mediator mediator) {
        super(nome, mediator);
    }

    public void enviaMensagem(String destinatario, String mensagem) {
        Mediator mediator = this.getMediator();
        mediator.enviaMensagem(this.getNome(), destinatario, mensagem);
    }

    public void receberMensagem(String remetente, String mensagem) {
        System.out.println(remetente + " escreveu: " + mensagem);
    }
}
