package br.ufpb.dcx.yan.quiz;

import java.util.ArrayList;
import java.util.List;

public class SistemaAmigo {
    private List<MensagemParaAlguem> mensagens;

    public SistemaAmigo() {
        this.mensagens = new ArrayList<>();
    }

    public void adicionaMensagem(MensagemParaAlguem mensagem) {
        mensagens.add(mensagem);
    }

    public MensagemParaAlguem pegaMensagem(String nomeDestino) {
        for (MensagemParaAlguem mensagem : mensagens) {
            if (mensagem.getDestino().equals(nomeDestino)) {
                return mensagem;
            }
        }
        return null; // Se não encontrar a mensagem
    }

    public void mostraMensagens() {
        for (MensagemParaAlguem mensagem : mensagens) {
            System.out.println(mensagem);
        }
    }
}