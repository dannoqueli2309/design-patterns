package mediator.chat_com_palavras_proibidas;

public class MinhaApp {
    public static void main(String[] args) {
        ChatMediator salaChat = new ChatMediator();

        Participante joao = new ParticipanteImpl("João", salaChat);
        Participante maria = new ParticipanteImpl("Maria", salaChat);
        Participante carlos = new ParticipanteImpl("Carlos", salaChat);
        Participante renato = new ParticipanteImpl("Renato", salaChat);

        salaChat.registraParticipante(joao);
        salaChat.registraParticipante(maria);
        salaChat.registraParticipante(carlos);
        salaChat.registraParticipante(renato);

        joao.enviaMensagem("Maria", "Ola Maria, tudo bem ?");
        maria.enviaMensagem("João", "Ola João, tudo ótimo e você?");
        renato.enviaMensagem("Carlos", "Eai Carlos, tudo na santa Paz");
        carlos.enviaMensagem("Renato", "Tudo perfeito, Renato");

        maria.receberMensagem("João", "Ola Maria, tudo bem ?");
        joao.receberMensagem("Maria", "Ola João, tudo ótimo e você?");
        carlos.receberMensagem("Renato", "Eai renato, tudo na santa Paz");
        renato.receberMensagem("Carlos", "Tudo perfeito, Carlos");
    }
}
