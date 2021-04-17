package mediator.chat_com_palavras_proibidas;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class ChatMediator implements Mediator {

    private Hashtable<String, Participante> participantes = new Hashtable<String, Participante>();
    private List<String> palavrasProibidas = new ArrayList<>();

    public ChatMediator() {
        palavrasProibidas.add("XXXXX");
        palavrasProibidas.add("@!xxx");
        palavrasProibidas.add("###@");
    }

    public void registraParticipante(Participante participante) {
        if (participantes.containsKey(participante.getNome())) {
            participantes.put(participante.getNome(), participante);
        } else {
            System.out.println("Usuario já cadastrado");
        }
    }

    @Override
    public void enviaMensagem(String remetente, String destinatario, String mensagem) {
        if (participantes.containsKey(remetente) && participantes.containsKey(destinatario)) {
            Participante pRemetente = participantes.get(remetente);
            Participante pDestinatario = participantes.get(destinatario);

            palavrasProibidas.forEach(palavraProibida -> {
                if (mensagem.contains(palavraProibida)) {
                    pRemetente.receberMensagem("Mediator", "Você leu uma mensagem contendo palavras");
                    return;
                }
            });

            pDestinatario.receberMensagem(remetente, mensagem);
        }
    }
}
