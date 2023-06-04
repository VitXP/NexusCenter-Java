/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.sistema.Sistema;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author vitor
 */
public class TelaInicial extends javax.swing.JFrame {

    private LoginJframe login;

    // Classes
    Mensagem mensagem = new Mensagem();
    EnviarDados dados = new EnviarDados();

    // Objetos  Looca
    Looca looca = new Looca();
    Sistema sistema = looca.getSistema();
    DiscoGrupo grupoDeDiscos = looca.getGrupoDeDiscos();
    Processador processador = looca.getProcessador();

    public TelaInicial(LoginJframe login) {
        initComponents();

        // Coletando Dados do Login Jframe
        this.login = login;
        String patrimonio = login.getPatrimonioDigitado(); // Obtendo a variávelA da instância de JanelaA passada
        String senha = login.getSenhaDigitada(); // Obtendo a variávelA da instância de JanelaA passada
        System.out.println(patrimonio);
        System.out.println(senha);

        //Icone
        this.setIconImage(
                new ImageIcon(getClass().getResource("/assets/logoIc.png")).getImage());

        this.setResizable(
                false);

        // Looca
        this.looca = new Looca();
        this.carregarDados();

        //Mensagem
        mensagem.mensagem();

        int delay = 10000; // Tempo em milissegundos (10 segundos)

        Timer timer = new Timer(delay, e -> {
            dados.enviar(patrimonio, senha);
        });

        timer.setRepeats(
                false); // Define que o timer não deve repetir

        timer.start(); // Inicia o timer
    }

    private TelaInicial() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void carregarDados() {

        // Tamanho Total Disco
        Long tamanhoTotalDisco = grupoDeDiscos.getTamanhoTotal();
        double tamanhoTotalGB = tamanhoTotalDisco != null ? tamanhoTotalDisco / (1024 * 1024 * 1024.0) : 0.0;
        int tamanhoTotalFormatadoDisco = (int) Math.round(tamanhoTotalGB);

        // Tamanho Memoria Total
        Long memoriaTotal01 = looca.getMemoria().getTotal();
        long totalMemory1 = memoriaTotal01 != null ? memoriaTotal01 : 0L; // Verifica se a memória total é nula e atribui 0 em caso afirmativo
        int tamanhoTotalFormatadoMemoria = (int) Math.round((double) totalMemory1 / (1024 * 1024 * 1024));

        // Processador
        lblCapacidade.setText(String.format("️ %d GB", tamanhoTotalFormatadoDisco));
        lblMemoriaRam.setText(String.format("%d GB", tamanhoTotalFormatadoMemoria));
        lblProcessador.setText(String.format("%s ", processador.getNome()));
        lblSistemaOperacional.setText(String.format("%s", sistema.getSistemaOperacional()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jFundoAzul = new javax.swing.JPanel();
        jLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLoginTitulo1 = new javax.swing.JLabel();
        jLabelPatrimonio = new javax.swing.JLabel();
        lblSistemaOperacional = new javax.swing.JLabel();
        jLabelPatrimonio1 = new javax.swing.JLabel();
        lblCapacidade = new javax.swing.JLabel();
        jLabelPatrimonio2 = new javax.swing.JLabel();
        lblProcessador = new javax.swing.JLabel();
        jLabelPatrimonio3 = new javax.swing.JLabel();
        lblMemoriaRam = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jFundoAzul.setBackground(new java.awt.Color(0, 32, 79));
        jFundoAzul.setForeground(new java.awt.Color(255, 255, 255));

        jLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/NexusImg.png"))); // NOI18N

        javax.swing.GroupLayout jFundoAzulLayout = new javax.swing.GroupLayout(jFundoAzul);
        jFundoAzul.setLayout(jFundoAzulLayout);
        jFundoAzulLayout.setHorizontalGroup(
            jFundoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFundoAzulLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(jFundoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFundoAzulLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFundoAzulLayout.createSequentialGroup()
                        .addComponent(jLogo)
                        .addGap(25, 25, 25))))
        );
        jFundoAzulLayout.setVerticalGroup(
            jFundoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFundoAzulLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLogo)
                .addGap(102, 102, 102)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLoginTitulo1.setBackground(new java.awt.Color(0, 32, 79));
        jLoginTitulo1.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLoginTitulo1.setForeground(new java.awt.Color(0, 32, 79));
        jLoginTitulo1.setText("Informações Máquina");

        jLabelPatrimonio.setBackground(new java.awt.Color(102, 102, 102));
        jLabelPatrimonio.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabelPatrimonio.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPatrimonio.setText("Capacidade Disco");

        lblSistemaOperacional.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblSistemaOperacional.setForeground(new java.awt.Color(102, 102, 102));
        lblSistemaOperacional.setText("--");

        jLabelPatrimonio1.setBackground(new java.awt.Color(102, 102, 102));
        jLabelPatrimonio1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabelPatrimonio1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPatrimonio1.setText("Sistema Operacional ");

        lblCapacidade.setBackground(new java.awt.Color(0, 0, 0));
        lblCapacidade.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblCapacidade.setForeground(new java.awt.Color(102, 102, 102));
        lblCapacidade.setText("--");

        jLabelPatrimonio2.setBackground(new java.awt.Color(102, 102, 102));
        jLabelPatrimonio2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabelPatrimonio2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPatrimonio2.setText("Processador");

        lblProcessador.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblProcessador.setForeground(new java.awt.Color(102, 102, 102));
        lblProcessador.setText("--");

        jLabelPatrimonio3.setBackground(new java.awt.Color(102, 102, 102));
        jLabelPatrimonio3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabelPatrimonio3.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPatrimonio3.setText("Memória Ram");

        lblMemoriaRam.setBackground(new java.awt.Color(102, 102, 102));
        lblMemoriaRam.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblMemoriaRam.setForeground(new java.awt.Color(102, 102, 102));
        lblMemoriaRam.setText("--");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelPatrimonio1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSistemaOperacional, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                    .addComponent(lblProcessador, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                    .addComponent(lblMemoriaRam, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                    .addComponent(jLabelPatrimonio2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPatrimonio3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCapacidade, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                    .addComponent(jLoginTitulo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jFundoAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFundoAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLoginTitulo1)
                .addGap(47, 47, 47)
                .addComponent(jLabelPatrimonio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSistemaOperacional)
                .addGap(27, 27, 27)
                .addComponent(jLabelPatrimonio2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProcessador)
                .addGap(27, 27, 27)
                .addComponent(jLabelPatrimonio3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMemoriaRam)
                .addGap(27, 27, 27)
                .addComponent(jLabelPatrimonio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCapacidade)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jFundoAzul;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelPatrimonio;
    private javax.swing.JLabel jLabelPatrimonio1;
    private javax.swing.JLabel jLabelPatrimonio2;
    private javax.swing.JLabel jLabelPatrimonio3;
    private javax.swing.JLabel jLoginTitulo1;
    private javax.swing.JLabel jLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCapacidade;
    private javax.swing.JLabel lblMemoriaRam;
    private javax.swing.JLabel lblProcessador;
    private javax.swing.JLabel lblSistemaOperacional;
    // End of variables declaration//GEN-END:variables
}
