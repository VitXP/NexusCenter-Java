/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import conexao.JDBC.Maquina;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vitor
 */
public class LoginJframe extends javax.swing.JFrame {

    public LoginJframe() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/assets/logoIc.png")).getImage());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bacckground = new javax.swing.JPanel();
        jFundoAzul = new javax.swing.JPanel();
        jLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLoginTitulo = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jLabelPatrimonio = new javax.swing.JLabel();
        btnLogar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtPatrimonio = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bacckground.setBackground(new java.awt.Color(255, 255, 255));
        Bacckground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jFundoAzul.setBackground(new java.awt.Color(0, 32, 79));
        jFundoAzul.setForeground(new java.awt.Color(255, 255, 255));

        jLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png"))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jFundoAzulLayout = new javax.swing.GroupLayout(jFundoAzul);
        jFundoAzul.setLayout(jFundoAzulLayout);
        jFundoAzulLayout.setHorizontalGroup(
            jFundoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFundoAzulLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLogo)
                .addGap(18, 18, 18))
            .addGroup(jFundoAzulLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFundoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
                .addContainerGap())
        );
        jFundoAzulLayout.setVerticalGroup(
            jFundoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFundoAzulLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLogo)
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Bacckground.add(jFundoAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 0, 330, 500));

        jLoginTitulo.setBackground(new java.awt.Color(0, 0, 0));
        jLoginTitulo.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLoginTitulo.setText("Login");
        Bacckground.add(jLoginTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabelSenha.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabelSenha.setText("Senha");
        Bacckground.add(jLabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabelPatrimonio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabelPatrimonio.setText("Patrimônio ");
        Bacckground.add(jLabelPatrimonio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        btnLogar.setBackground(new java.awt.Color(0, 25, 61));
        btnLogar.setForeground(new java.awt.Color(255, 255, 255));
        btnLogar.setText("Logar");
        btnLogar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });
        Bacckground.add(btnLogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 340, 35));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Bacckground.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 500, 0));

        txtPatrimonio.setCaretColor(new java.awt.Color(0, 32, 79));
        txtPatrimonio.setDisabledTextColor(new java.awt.Color(0, 32, 79));
        txtPatrimonio.setSelectionColor(new java.awt.Color(0, 32, 79));
        Bacckground.add(txtPatrimonio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 340, 35));

        txtSenha.setCaretColor(new java.awt.Color(0, 32, 79));
        txtSenha.setDisabledTextColor(new java.awt.Color(0, 32, 79));
        txtSenha.setSelectionColor(new java.awt.Color(0, 32, 79));
        Bacckground.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 340, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bacckground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bacckground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String patrimonio() {
        return "1";
    }

    public String senha() {
        return "1";
    }

    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed

        //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
        // Validação Log
        String patrimonio_digitado = txtPatrimonio.getText();
        String senha_digitada = txtSenha.getText();

        Maquina validMaquina = new Maquina(patrimonio_digitado, senha_digitada);// Adicionado Construtor na classe máquina]
        UsuarioDAO validacaoLog = new UsuarioDAO();// Executa-se a consulta ao banco referente ao método para instanciar objeto Maquina que servirá ara autenticação;
        ResultSet rsusariodaos = validacaoLog.autenticsacaoUsuario(validMaquina);// Nesta linha é instanciado objeto com parâmetros provenientes da consulta com a Azure
        Log log = new Log();

        try {
            log.login(rsusariodaos, rsusariodaos.next());
        } catch (SQLException ex) {
            Logger.getLogger(LoginJframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {

            // Objetos JDBC
            String patrimonio_maquina = txtPatrimonio.getText();
            String senha_maquina = txtSenha.getText();
            System.out.println(patrimonio_maquina);
            System.out.println(senha_maquina);

            Maquina maquina = new Maquina(patrimonio_maquina, senha_maquina);// Adicionado Construtor na classe máquina

            UsuarioDAO objUsuarioDAO = new UsuarioDAO();// Executa-se a consulta ao banco referente ao método para instanciar objeto Maquina que servirá ara autenticação;
            ResultSet rsusariodao = objUsuarioDAO.autenticsacaoUsuario(maquina);// Nesta linha é instanciado objeto com parâmetros provenientes da consulta com a Azure

            if (rsusariodao.next()) {
                //lOGADO

                //Mensagem
                Mensagem mensagem = new Mensagem();
                mensagem.mensagemLogin();

                //Mudar Tela
                TelaInicial telaNext = new TelaInicial();
                this.dispose();
                telaNext.setVisible(rootPaneCheckingEnabled);

            } else {
                // Erro
                ImageIcon icon = new ImageIcon(getClass().getResource("/assets/erro.png"));
                JOptionPane.showMessageDialog(null, "Login Inválido",
                        "Erro", JOptionPane.INFORMATION_MESSAGE, icon);
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "erro");
        }


    }//GEN-LAST:event_btnLogarActionPerformed

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
            java.util.logging.Logger.getLogger(LoginJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bacckground;
    private javax.swing.JButton btnLogar;
    private javax.swing.JPanel jFundoAzul;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelPatrimonio;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLoginTitulo;
    private javax.swing.JLabel jLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtPatrimonio;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    private double bytesToGB(long memoriaEmUso) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
