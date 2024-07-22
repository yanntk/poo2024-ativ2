package br.ufpb.dcx.yan.quiz;

import java.util.HashMap;
import java.util.Map;

public class SistemaAmigoMap {
    private Map<String, MensagemParaAlguem> mensagens;

    public SistemaAmigoMap() {
        this.mensagens = new HashMap<>();
    }

    public void adicionaMensagem(MensagemParaAlguem mensagem) {
        mensagens.put(mensagem.getDestino(), mensagem);
    }

    public MensagemParaAlguem pegaMensagem(String nomeDestino) {
        return mensagens.get(nomeDestino);
    }

    public void mostraMensagens() {
        for (MensagemParaAlguem mensagem : mensagens.values()) {
            System.out.println(mensagem);
        }
    }
}