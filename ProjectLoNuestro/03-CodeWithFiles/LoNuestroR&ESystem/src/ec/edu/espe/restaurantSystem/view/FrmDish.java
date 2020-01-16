/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.restaurantSystem.view;

import ec.edu.espe.restaurantSystem.controller.DessertManager;
import ec.edu.espe.restaurantSystem.controller.DishManager;
import ec.edu.espe.restaurantSystem.controller.DrinkManager;
import ec.edu.espe.restaurantSystem.controller.FirstDishManager;
import ec.edu.espe.restaurantSystem.controller.MainCourseManager;
import ec.edu.espe.restaurantSystem.lib.FileLibrary;
import ec.edu.espe.restaurantSystem.model.FirstDish;
import ec.edu.espe.restaurantSystem.model.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author user
 */
public class FrmDish extends javax.swing.JFrame {
    private Account user;
    /**
     * Creates new form frmDish
     */
    public FrmDish() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.cmbQuantity.setVisible(false);
        this.lblQuantity.setVisible(false);
        this.setTitle("\tLo Nuestro Restaurant  | Gestión de Platos");
        setIconImage(new ImageIcon(getClass().getResource("/ec/edu/espe/restaurantSystem/view/img/icon.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gbtType = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        spiPrice = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        rbtMainCourse = new javax.swing.JRadioButton();
        rbtDessert = new javax.swing.JRadioButton();
        rbtDrink = new javax.swing.JRadioButton();
        rbtExtra = new javax.swing.JRadioButton();
        btnAddDish = new javax.swing.JButton();
        rbtFirstDish = new javax.swing.JRadioButton();
        lblQuantity = new javax.swing.JLabel();
        cmbQuantity = new javax.swing.JComboBox<>();
        btnExit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Ingreso de Nuevo Plato");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setText("Precio:");

        txtName.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtName.setToolTipText("Ingrese nombre del plato");
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        spiPrice.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        spiPrice.setModel(new javax.swing.SpinnerNumberModel(1.0f, null, null, 0.05f));
        spiPrice.setToolTipText("Precio del plato");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("Tipo:");

        gbtType.add(rbtMainCourse);
        rbtMainCourse.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        rbtMainCourse.setText("Plato Fuerte");
        rbtMainCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtMainCourseActionPerformed(evt);
            }
        });

        gbtType.add(rbtDessert);
        rbtDessert.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        rbtDessert.setText("Postre");
        rbtDessert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDessertActionPerformed(evt);
            }
        });

        gbtType.add(rbtDrink);
        rbtDrink.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        rbtDrink.setText("Bebida");
        rbtDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDrinkActionPerformed(evt);
            }
        });

        gbtType.add(rbtExtra);
        rbtExtra.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        rbtExtra.setText("Extra");
        rbtExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtExtraActionPerformed(evt);
            }
        });

        btnAddDish.setBackground(new java.awt.Color(255, 153, 0));
        btnAddDish.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnAddDish.setText("Añadir");
        btnAddDish.setToolTipText("Añadir plato al menu");
        btnAddDish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDishActionPerformed(evt);
            }
        });

        gbtType.add(rbtFirstDish);
        rbtFirstDish.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        rbtFirstDish.setText("Entrada");
        rbtFirstDish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFirstDishActionPerformed(evt);
            }
        });

        lblQuantity.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblQuantity.setText("Cantidad:");

        cmbQuantity.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        cmbQuantity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "350 ml", "500 ml", "750 ml", "1 L", "1.5 L", "2 L", "3 L" }));
        cmbQuantity.setToolTipText("Cantidad de bebida");

        btnExit.setBackground(new java.awt.Color(204, 0, 51));
        btnExit.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnExit.setText("Regresar");
        btnExit.setToolTipText("Regresar a menu");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(9, 9, 9)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddDish)
                                .addGap(166, 166, 166)
                                .addComponent(btnExit))
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtDessert)
                            .addComponent(rbtExtra)
                            .addComponent(rbtFirstDish)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(spiPrice, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rbtMainCourse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtDrink)
                                .addGap(60, 60, 60)
                                .addComponent(lblQuantity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spiPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtFirstDish)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtMainCourse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtDessert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtDrink)
                            .addComponent(lblQuantity)
                            .addComponent(cmbQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtExtra)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddDish, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDrinkActionPerformed
        
        this.cmbQuantity.setVisible(true);
        this.lblQuantity.setVisible(true);
    }//GEN-LAST:event_rbtDrinkActionPerformed

    private void rbtFirstDishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtFirstDishActionPerformed
        
        this.cmbQuantity.setVisible(false);
        this.lblQuantity.setVisible(false);
    }//GEN-LAST:event_rbtFirstDishActionPerformed

    private void rbtMainCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtMainCourseActionPerformed
        
        this.cmbQuantity.setVisible(false);
        this.lblQuantity.setVisible(false);
    }//GEN-LAST:event_rbtMainCourseActionPerformed

    private void rbtDessertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDessertActionPerformed
        
        this.cmbQuantity.setVisible(false);
        this.lblQuantity.setVisible(false);
    }//GEN-LAST:event_rbtDessertActionPerformed

    private void rbtExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtExtraActionPerformed
       
        this.cmbQuantity.setVisible(false);
        this.lblQuantity.setVisible(false);
    }//GEN-LAST:event_rbtExtraActionPerformed

    private void btnAddDishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDishActionPerformed
        
        String type;
        String name = this.txtName.getText();
        float price = Float.parseFloat(this.spiPrice.getValue().toString());
        ////////
        if(rbtFirstDish.isSelected()){
            registryFD(name, price);
        }
        if(rbtMainCourse.isSelected()){
            registryMC(name, price);
        }
        if(rbtDessert.isSelected()){
            registryDst(name, price);
        }      
        if(rbtDrink.isSelected())
        {            
            registryDnk(name, price);
        }
    }//GEN-LAST:event_btnAddDishActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        
        int answer = JOptionPane.showConfirmDialog(null, "¿Desea cancelar el ingreso del plato?");
            if(answer == 0)
            {
                backToMenu();
            }
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
       
    }//GEN-LAST:event_txtNameActionPerformed
    public void registryFD(String name, float price){
        FirstDish firstDish = new FirstDish();
            int id = firstDish.assingId();
            firstDish.setId(id);
            firstDish.setName(name);
            firstDish.setPrice(price);
            FirstDishManager.addFirstDish(firstDish);            
            JOptionPane.showMessageDialog(rootPane,"Registro de plato exitoso" );
            backToMenu();
    }
    public void registryMC(String name, float price){
        MainCourse mainCourse = new MainCourse();
            int id = mainCourse.assingId();
            mainCourse.setId(id);
            mainCourse.setName(name);
            mainCourse.setPrice(price);
            MainCourseManager.addMainCourse(mainCourse);
            JOptionPane.showMessageDialog(rootPane,"Registro de plato exitoso" );
            backToMenu();
    }
    public void registryDst(String name, float price){
        Dessert dessert = new Dessert();
            int id = dessert.assingId();
            dessert.setId(id);
            dessert.setName(name);
            dessert.setPrice(price);
            DessertManager.addDessert(dessert);
            JOptionPane.showMessageDialog(rootPane,"Registro de plato exitoso" );
            backToMenu();
    }
    public void registryDnk(String name, float price){
        Drink product = new Drink();
            int id = product.assingId();
            product.setId(id);
            product.setName(name);
            product.setPrice(price);
            product.setQuantity(getQuantity());
            DrinkManager.addDrink(product);
            JOptionPane.showMessageDialog(rootPane,"Registro de plato exitoso");
            backToMenu();
    }
      
    
    public void  backToMenu(){
        if(this.user.getUserType().equals("Administrador")){
           FrmMenuManager menuAdmin = new FrmMenuManager(this.user);
           menuAdmin.setVisible(true);
           this.setVisible(false); 
        }else{
           FrmMenuEmployee menuEmployee = new FrmMenuEmployee(this.user);
           menuEmployee.setVisible(true);
           this.setVisible(false); 
        }
    }
    
    public int getQuantity()
    {
        int index = this.cmbQuantity.getSelectedIndex();
        switch (index) {
            case 0:
                return 350;
            case 1:
                return 500;
            case 2:
                return 750;
            case 3:
                return 1000;
            case 4:
                return 1500;
            case 5:
                return 2000;
            default:
                return 3000;
        }
        
    }
    public String getTypeDish(){
        if(rbtDessert.isSelected()){
            return "Postre";
        }else if(rbtExtra.isSelected()){
            return "Extra";
        }
        else if(rbtFirstDish.isSelected()){
            return "Entrada";
        }else return "Plato Fuerte";
    }
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
            java.util.logging.Logger.getLogger(FrmDish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDish().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDish;
    private javax.swing.JButton btnExit;
    private javax.swing.JComboBox<String> cmbQuantity;
    private javax.swing.ButtonGroup gbtType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JRadioButton rbtDessert;
    private javax.swing.JRadioButton rbtDrink;
    private javax.swing.JRadioButton rbtExtra;
    private javax.swing.JRadioButton rbtFirstDish;
    private javax.swing.JRadioButton rbtMainCourse;
    private javax.swing.JSpinner spiPrice;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
    /**
     * @return the user
     */
    public Account getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(Account user) {
        this.user = user;
    }
}
