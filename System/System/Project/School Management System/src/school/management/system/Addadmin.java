package school.management.system;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.*;

public class Addadmin extends javax.swing.JFrame {
Connection          con = null;
ResultSet           rs  = null;
PreparedStatement   pst = null;

    public Addadmin() {
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

        btnExit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtuname = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtpw = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txttp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtaid = new javax.swing.JTextField();
        btnBack1 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add admin details");
        setBackground(new java.awt.Color(51, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        getContentPane().setLayout(null);

        btnExit.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.jpg"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(1297, 11, 50, 50);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(345, 204, 36, 17);

        txtuname.setColumns(15);
        txtuname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtunameActionPerformed(evt);
            }
        });
        getContentPane().add(txtuname);
        txtuname.setBounds(601, 317, 126, 20);

        txtaddress.setColumns(20);
        txtaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressActionPerformed(evt);
            }
        });
        getContentPane().add(txtaddress);
        txtaddress.setBounds(601, 241, 166, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("T.P");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(345, 280, 22, 17);

        txtpw.setColumns(15);
        getContentPane().add(txtpw);
        txtpw.setBounds(601, 356, 126, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Admin Id");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(345, 166, 54, 17);

        txtname.setColumns(50);
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname);
        txtname.setBounds(601, 203, 260, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Address");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(345, 242, 52, 17);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Enter New Admin Details");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(345, 25, 531, 70);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("User Name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(345, 318, 69, 17);

        txttp.setColumns(12);
        getContentPane().add(txttp);
        txttp.setBounds(601, 279, 102, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Password");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(345, 359, 61, 17);

        txtaid.setColumns(5);
        txtaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaidActionPerformed(evt);
            }
        });
        getContentPane().add(txtaid);
        txtaid.setBounds(601, 165, 46, 20);

        btnBack1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.jpg"))); // NOI18N
        btnBack1.setBorder(null);
        btnBack1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack1.setPreferredSize(new java.awt.Dimension(50, 50));
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack1);
        btnBack1.setBounds(10, 11, 50, 50);

        btnAdd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register.png"))); // NOI18N
        btnAdd.setBorder(null);
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(601, 448, 200, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add admin.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(960, 360, 400, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
     String id      = txtaid.getText();
     String name    = txtname.getText();
     String address = txtaddress.getText();
     String tp      = txttp.getText();
     String uname   = txtuname.getText();
     String pword   = txtpw.getText();
        try {
            String qry="INSERT INTO admin (a_id,name,address,tp,uname,pword) VALUES ('"+id+"','"+name+"','"+address+"','"+tp+"','"+uname+"','"+pword+"')";
                pst=con.prepareStatement(qry);
                
                pst.execute();
                JOptionPane.showMessageDialog(this,"record added");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        AdminOption ob=new AdminOption();
        ob.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed
 
    }//GEN-LAST:event_txtaddressActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
      
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaidActionPerformed
        
    }//GEN-LAST:event_txtaidActionPerformed

    private void txtunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtunameActionPerformed
        
    }//GEN-LAST:event_txtunameActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtaid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpw;
    private javax.swing.JTextField txttp;
    private javax.swing.JTextField txtuname;
    // End of variables declaration//GEN-END:variables
}
