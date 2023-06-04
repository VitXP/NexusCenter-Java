/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author vitor
 */
public class Mensagem {

    public void mensagem() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/assets/lupa.png"));
        String mensagem = "Os dados estão sendo coletados e enviados em segundo plano!";
        String titulo = "Enviando os Dados!";
        int messageType = JOptionPane.INFORMATION_MESSAGE;
        int delay = 5000; // Tempo em milissegundos (5 segundos)

        Timer timer = new Timer(delay, e -> {
            JOptionPane.getRootFrame().dispose(); // Fecha o JOptionPane após o tempo definido
        });

        timer.setRepeats(false); // Define que o timer não deve repetir

        timer.start(); // Inicia o timer

        JOptionPane.showMessageDialog(null, mensagem, titulo, messageType, icon);
    }

    public void mensagemLogin() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/assets/verificado.png"));
        String mensagem = "Login realizado!";
        String titulo = "Seja Bem-Vindo!";
        int messageType = JOptionPane.INFORMATION_MESSAGE;
        int delay = 4000; // Tempo em milissegundos (5 segundos)

        Timer timer = new Timer(delay, e -> {
            JOptionPane.getRootFrame().dispose(); // Fecha o JOptionPane após o tempo definido
        });

        timer.setRepeats(false); // Define que o timer não deve repetir

        timer.start(); // Inicia o timer

        JOptionPane.showMessageDialog(null, mensagem, titulo, messageType, icon);

    }

}
