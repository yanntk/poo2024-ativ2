package br.ufpb.dcx.yan.quiz;

public class TestaSistemaAmigo {
    public static void main(String[] args) {
        SistemaAmigo sistema = new SistemaAmigo();

        MensagemParaAlguem mensagem1 = new MensagemParaAlguem("João", "Feliz aniversário!");
        MensagemParaAlguem mensagem2 = new MensagemParaAlguem("Maria", "Você é incrível!");
        MensagemParaAlguem mensagem3 = new MensagemParaAlguem("João", "Você é o melhor!");

        sistema.adicionaMensagem(mensagem1);
        sistema.adicionaMensagem(mensagem2);
        sistema.adicionaMensagem(mensagem3);

        sistema.mostraMensagens();

        MensagemParaAlguem mensagemEncontrada = sistema.pegaMensagem("João");
        if (mensagemEncontrada != null) {
            System.out.println("Mensagem encontrada para João: " + mensagemEncontrada.getMensagem());
        } else {
            System.out.println("Nenhuma mensagem encontrada para João");
        }
    }
}