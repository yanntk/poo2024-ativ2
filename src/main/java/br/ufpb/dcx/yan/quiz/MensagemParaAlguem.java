package br.ufpb.dcx.yan.quiz;

public class MensagemParaAlguem {
    private String destino;
    private String mensagem;

    public MensagemParaAlguem(String destino, String mensagem) {
        this.destino = destino;
        this.mensagem = mensagem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return "Mensagem para " + destino + ": " + mensagem;
    }
}

