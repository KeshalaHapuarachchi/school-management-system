
package school.management.system;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.*;

public class updatenap extends javax.swing.JFrame {
Connection          con = null;
ResultSet           rs  = null;
PreparedStatement   pst = null;

    public updatenap() {
    //      this.setUndecorated(true);
        this.setAlwaysOnTop(false);
        this.setResizable(false);
        this.setVisible(true);
        
          con=connection.connection.connect();
          
        initComponents();
        
            Toolkit tk = Toolkit.getDefaultToolkit();
        
            int xsize = (int) tk.getScreenSize().getWidth();
            int ysize = (int) tk.getScreenSize().getHeight();
            
            this.setSize(xsize, ysize);
      
         getContentPane().setBackground(Color.white);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("schoolmsdb?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        napQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT n FROM Nap n");
        napList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : napQuery.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        txtlname = new javax.swing.JTextField();
        txtfullname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtdob = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txttp = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtacno = new javax.swing.JTextField();
        txtbank = new javax.swing.JTextField();
        txtpost = new javax.swing.JTextField();
        txtnic = new javax.swing.JTextField();
        cmbGender = new javax.swing.JComboBox();
        cmdmarrage = new javax.swing.JComboBox();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("NAP Form");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(460, 26, 243, 56);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("ID No");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(48, 125, 34, 17);

        txtnid.setColumns(10);
        getContentPane().add(txtnid);
        txtnid.setBounds(209, 124, 200, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("First Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(48, 163, 68, 17);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Last Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(48, 201, 67, 17);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Full Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(48, 239, 63, 17);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Age");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(48, 277, 25, 17);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("DOB");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(48, 317, 30, 17);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Gender");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(48, 353, 48, 17);

        txtfname.setColumns(20);
        getContentPane().add(txtfname);
        txtfname.setBounds(209, 162, 200, 20);

        txtlname.setColumns(20);
        getContentPane().add(txtlname);
        txtlname.setBounds(209, 200, 200, 20);

        txtfullname.setColumns(50);
        getContentPane().add(txtfullname);
        txtfullname.setBounds(209, 238, 326, 20);

        txtage.setColumns(3);
        getContentPane().add(txtage);
        txtage.setBounds(209, 276, 30, 20);

        txtdob.setColumns(12);
        getContentPane().add(txtdob);
        txtdob.setBounds(209, 314, 102, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("T.P");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(48, 391, 22, 17);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Address");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(711, 125, 52, 17);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Marrage Stetus");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(711, 163, 97, 17);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("AC_No");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(711, 201, 44, 17);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Bank");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(711, 239, 32, 17);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Post");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(711, 277, 28, 17);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("NIC_No");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(711, 315, 47, 17);

        txttp.setColumns(12);
        getContentPane().add(txttp);
        txttp.setBounds(209, 390, 102, 20);

        txtaddress.setColumns(40);
        getContentPane().add(txtaddress);
        txtaddress.setBounds(901, 124, 326, 20);

        txtacno.setColumns(15);
        txtacno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtacnoActionPerformed(evt);
            }
        });
        getContentPane().add(txtacno);
        txtacno.setBounds(901, 200, 126, 20);

        txtbank.setColumns(10);
        getContentPane().add(txtbank);
        txtbank.setBounds(901, 238, 126, 20);

        txtpost.setColumns(15);
        getContentPane().add(txtpost);
        txtpost.setBounds(901, 276, 126, 20);

        txtnic.setColumns(12);
        getContentPane().add(txtnic);
        txtnic.setBounds(901, 314, 126, 20);

        cmbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        getContentPane().add(cmbGender);
        cmbGender.setBounds(209, 352, 59, 20);

        cmdmarrage.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        getContentPane().add(cmdmarrage);
        cmdmarrage.setBounds(901, 162, 66, 20);

        btnUpdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        btnUpdate.setBorder(null);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(710, 370, 50, 50);

        btnBack.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.jpg"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(10, 11, 50, 50);

        btnExit.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.jpg"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(1306, 11, 50, 50);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, napList, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${NId}"));
        columnBinding.setColumnName("NId");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${FName}"));
        columnBinding.setColumnName("FName");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${LName}"));
        columnBinding.setColumnName("LName");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fullName}"));
        columnBinding.setColumnName("Full Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${age}"));
        columnBinding.setColumnName("Age");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dob}"));
        columnBinding.setColumnName("Dob");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${gender}"));
        columnBinding.setColumnName("Gender");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tp}"));
        columnBinding.setColumnName("Tp");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${address}"));
        columnBinding.setColumnName("Address");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${marage}"));
        columnBinding.setColumnName("Marage");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${acNo}"));
        columnBinding.setColumnName("Ac No");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bank}"));
        columnBinding.setColumnName("Bank");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${post}"));
        columnBinding.setColumnName("Post");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nic}"));
        columnBinding.setColumnName("Nic");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 580, 1331, 88);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update menu.jpg"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(870, 110, 400, 400);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nap menu.jpg"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(60, 120, 400, 400);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtacnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtacnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtacnoActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            String id =txtnid.getText();
            String fname = txtfname.getText();
            String lname = txtlname.getText();
            String fullname =txtfullname.getText();
            String age = txtage.getText();
            String dob =txtdob.getText();
            String gender =cmbGender.getSelectedItem().toString();
            String tp= txttp.getText();
            String address =txtaddress.getText();
            String marage =cmdmarrage.getSelectedItem().toString();
            String acno =txtacno.getText();
            String bank = txtbank.getText();
            String post = txtpost.getText();
            String nic= txtnic.getText();

            String sql="Update teacher set  ";
            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        NapMenu ob=new NapMenu();
        ob.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(updatenap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatenap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatenap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatenap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatenap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cmbGender;
    private javax.swing.JComboBox cmdmarrage;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.util.List<school.management.system.Nap> napList;
    private javax.persistence.Query napQuery;
    private javax.swing.JTextField txtacno;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtbank;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtfullname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtnic;
    private javax.swing.JTextField txtnid;
    private javax.swing.JTextField txtpost;
    private javax.swing.JTextField txttp;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
