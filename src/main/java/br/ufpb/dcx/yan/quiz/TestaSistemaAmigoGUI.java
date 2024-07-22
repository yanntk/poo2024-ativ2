package br.ufpb.dcx.yan.quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestaSistemaAmigoGUI {
    private SistemaAmigoMap sistema;
    private JFrame janela;
    private JTextField campoDestino;
    private JTextField campoMensagem;
    private JTextArea areaMensagens;

    public TestaSistemaAmigoGUI() {
        sistema = new SistemaAmigoMap();
        criarJanela();
    }

    private void criarJanela() {
        janela = new JFrame("Sistema Amigo");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new BorderLayout());

        JPanel painelEntrada = new JPanel();
        painelEntrada.setLayout(new GridLayout(2, 2));

        JLabel labelDestino = new JLabel("Destino:");
        campoDestino = new JTextField();
        JLabel labelMensagem = new JLabel("Mensagem:");
        campoMensagem = new JTextField();

        painelEntrada.add(labelDestino);
        painelEntrada.add(campoDestino);
        painelEntrada.add(labelMensagem);
        painelEntrada.add(campoMensagem);

        JButton botaoAdicionar = new JButton("Adicionar Mensagem");
        botaoAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionaMensagem();
            }
        });

        areaMensagens = new JTextArea();
        areaMensagens.setEditable(false);

        janela.add(painelEntrada, BorderLayout.NORTH);
        janela.add(botaoAdicionar, BorderLayout.CENTER);
        janela.add(new JScrollPane(areaMensagens), BorderLayout.SOUTH);

        janela.pack();
        janela.setVisible(true);
    }

    private void adicionaMensagem() {
        String destino = campoDestino.getText();
        String mensagem = campoMensagem.getText();

        if (!destino.isEmpty() && !mensagem.isEmpty()) {
            MensagemParaAlguem mensagemParaAlguem = new MensagemParaAlguem(destino, mensagem);
            sistema.adicionaMensagem(mensagemParaAlguem);
            areaMensagens.append("Mensagem adicionada: " + mensagemParaAlguem + "\n");
            campoDestino.setText("");
            campoMensagem.setText("");
        }
    }

    public static void main(String[] args) {
        new TestaSistemaAmigoGUI();
    }
}