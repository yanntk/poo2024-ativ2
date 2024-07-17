package br.ufpb.dcx.yan.quiz;


public class Mensagem {
    private String texto;
    private String remetente;
    private String destinatario;
    private boolean anonima;

    // Construtor com todos os atributos
    public Mensagem(String texto, String remetente, String destinatario, boolean anonima) {
        this.texto = texto;
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.anonima = anonima;
    }

    // Getters e Setters
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public boolean isAnonima() {
        return anonima;
    }

    public void setAnonima(boolean anonima) {
        this.anonima = anonima;
    }

    // Método para exibir a mensagem
    public String exibirMensagem() {
        if (anonima) {
            return "Mensagem anônima para " + destinatario + ": " + texto;
        } else {
            return remetente + " para " + destinatario + ": " + texto;
        }
    }

    @Override
    public String toString() {
        return "Mensagem{" +
                "texto='" + texto + '\'' +
                ", remetente='" + remetente + '\'' +
                ", destinatario='" + destinatario + '\'' +
                ", anonima=" + anonima +
                '}';
    }
}

