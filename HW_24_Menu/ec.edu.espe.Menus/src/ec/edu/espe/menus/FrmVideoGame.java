/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.menus;

/**
 *
 * @author Labs-DCCO
 */
public class FrmVideoGame extends javax.swing.JFrame {

    /**
     * Creates new form FrmVideoGame
     */
    public FrmVideoGame() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuGameOn = new javax.swing.JMenu();
        mnuItemAbout = new javax.swing.JMenuItem();
        mnuItemExit = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();
        mnuAccesorie = new javax.swing.JMenu();
        mnuStock = new javax.swing.JMenu();
        mnuItemEnter = new javax.swing.JMenuItem();
        mnuItemTake = new javax.swing.JMenuItem();
        mnuItemSearch = new javax.swing.JMenuItem();
        mnuItemUpdate = new javax.swing.JMenuItem();
        mnuItemReport = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuGameOn.setText("Game On");

        mnuItemAbout.setText("Acerca de");
        mnuGameOn.add(mnuItemAbout);

        mnuItemExit.setText("Salir");
        mnuGameOn.add(mnuItemExit);

        jMenuBar1.add(mnuGameOn);

        mnuHelp.setText("Ayuda");
        jMenuBar1.add(mnuHelp);

        mnuAccesorie.setText("Accesorios");

        mnuStock.setText("Bodega");

        mnuItemEnter.setText("Ingresar");
        mnuStock.add(mnuItemEnter);

        mnuItemTake.setText("Sacar");
        mnuStock.add(mnuItemTake);

        mnuItemSearch.setText("Buscar");
        mnuStock.add(mnuItemSearch);

        mnuItemUpdate.setText("Actualizar");
        mnuStock.add(mnuItemUpdate);

        mnuAccesorie.add(mnuStock);

        mnuItemReport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mnuItemReport.setText("Reporte");
        mnuItemReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemReportActionPerformed(evt);
            }
        });
        mnuAccesorie.add(mnuItemReport);

        jMenuBar1.add(mnuAccesorie);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuItemReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemReportActionPerformed
        // TODO add your handling code here:
        FrmReport frmReport = new FrmReport();
        frmReport.setVisible(true);
    }//GEN-LAST:event_mnuItemReportActionPerformed

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
            java.util.logging.Logger.getLogger(FrmVideoGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVideoGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVideoGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVideoGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVideoGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuAccesorie;
    private javax.swing.JMenu mnuGameOn;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenuItem mnuItemAbout;
    private javax.swing.JMenuItem mnuItemEnter;
    private javax.swing.JMenuItem mnuItemExit;
    private javax.swing.JMenuItem mnuItemReport;
    private javax.swing.JMenuItem mnuItemSearch;
    private javax.swing.JMenuItem mnuItemTake;
    private javax.swing.JMenuItem mnuItemUpdate;
    private javax.swing.JMenu mnuStock;
    // End of variables declaration//GEN-END:variables
}
