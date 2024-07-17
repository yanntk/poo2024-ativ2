package br.ufpb.dcx.yan.quiz;

public class ProgramaQuiz {
    public static void main(String[] args) {
        SistemaQuiz sistema = new SistemaQuizAyla();

        // Cadastrar perguntas
        sistema.cadastraPergunta(new PerguntaME("Qual é a capital do Brasil?", "Brasília"));
        sistema.cadastraPergunta(new PerguntaVF("O sol é uma estrela?", "Sim"));
        sistema.cadastraPergunta(new PerguntaDissertativa("Descreva o processo de fotosíntese"));

        // Sortear uma pergunta
        Pergunta pergunta = sistema.sorteiaPergunta();

        // Exibir a pergunta
        System.out.println("Pergunta: " + pergunta.getEnunciado());

        // Tratar a resposta do usuário
        // (essa parte você pode implementar como quiser, por exemplo, lendo a resposta do usuário e verificando se está correta)
    }
}