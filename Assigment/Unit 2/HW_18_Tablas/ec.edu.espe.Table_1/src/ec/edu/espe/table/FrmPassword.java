/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.table;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author camyt
 */
public class FrmPassword extends javax.swing.JFrame {

    /**
     * Creates new form frmPassword
     */
    public FrmPassword() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        pswPassword = new javax.swing.JPasswordField();
        btnUser = new javax.swing.JButton();
        btnEntery = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        btnUser.setText("Crear usuario");
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        btnEntery.setText("Ingresar");
        btnEntery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnteryActionPerformed(evt);
            }
        });

        btnShow.setText("Mostrar");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnShow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(btnUser)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(pswPassword))
                        .addGap(29, 29, 29)
                        .addComponent(btnEntery)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnEntery)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pswPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUser)
                    .addComponent(btnShow))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        // TODO add your handling code here:
        FrmNewUser frmnewUser = new FrmNewUser();
        frmnewUser.setVisible(true);
        this.setVisible(false);
        
        
        
        
    }//GEN-LAST:event_btnUserActionPerformed

    public boolean valUser(String userIn, String newUser){
        boolean good = true;
        if(userIn.length() == newUser.length()){
            good = true;
        }
        else{
            good = false;
        }
        return good;
    }
    public boolean valPassword(char[] passwordIn,String passwordNewUser){
        boolean good = true;
        Password psw = new Password();
        String pss = psw.Decrypt(passwordNewUser);
        
        
        char[] passwordNew = pss.toCharArray();
        if(passwordNew.length != passwordIn.length){
            good = false;
        }
        else{
            good = Arrays.equals(passwordIn, passwordNew);
        }
        
        
        return good;
    }
    public void createFile(){
        FileLibrary fl = new FileLibrary();
        Password psw = new Password();
        String newPassw = psw.Encrypt(FrmNewUser.pswNewPassword.getText());
        User user = new User(txtUser.getText(),newPassw);
        fl.addToFile(user);
    }
    private void btnEnteryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnteryActionPerformed
        // TODO add your handling code here:
       
        Password psw = new Password();
        char[] passwordIn = pswPassword.getPassword();
        String newPassw = psw.Encrypt(FrmNewUser.pswNewPassword.getText());
        String user = String.valueOf(txtUser.getText());
        if ((valPassword(passwordIn, newPassw)) && ((valUser(user, FrmNewUser.txtNewUser.getText())))) {
            JOptionPane.showMessageDialog(rootPane,"La contraseña y el usuario es correcta.\nBienvenido al sistema");
        }else{
             JOptionPane.showMessageDialog(rootPane,"La contraseña y/o usuario es incorrecta.");
        }
        ////////////////////
       // createFile();
        
        
        /*
        String user = String.valueOf(txtUser.getText());
        if(valUser(user, frmNewUser.txtNewUser.getText())){
            JOptionPane.showMessageDialog(rootPane,"El usuario es correcto.");
        }else{
             JOptionPane.showMessageDialog(rootPane,"El usuario  es incorrecto.");
        }*/
  
        
        
        
        
    }//GEN-LAST:event_btnEnteryActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // TODO add your handling code here:
        FrmTable frmTable = new FrmTable();
        frmTable.setVisible(true);
        this.setVisible(false);
        
        
        
        
       
        
    }//GEN-LAST:event_btnShowActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntery;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField pswPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
