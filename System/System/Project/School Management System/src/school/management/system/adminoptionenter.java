package school.management.system;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.*;


import javax.swing.JOptionPane;

public class adminoptionenter extends javax.swing.JFrame {
        Connection          con =null;
        ResultSet           rs  =null;
        PreparedStatement   pst =null;
    public adminoptionenter() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtuname = new javax.swing.JTextField();
        txtpw = new javax.swing.JTextField();
        btnBack1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Enter Your User Name password ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(318, 11, 851, 56);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("User Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(318, 185, 69, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(318, 230, 61, 17);

        txtuname.setColumns(15);
        getContentPane().add(txtuname);
        txtuname.setBounds(460, 184, 200, 20);

        txtpw.setColumns(15);
        getContentPane().add(txtpw);
        txtpw.setBounds(460, 229, 200, 20);

        btnBack1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.jpg"))); // NOI18N
        btnBack1.setBorder(null);
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack1);
        btnBack1.setBounds(10, 11, 50, 50);

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(460, 316, 200, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin option.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(960, 360, 400, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        Login ob=new Login();
        ob.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   String name   = txtuname.getText();
     String pw   = txtpw.getText();
     String q    = "Select * from admin where uname=? and pword=?";
        try {
           /* Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmsdb","root","");*/
                pst=con.prepareStatement(q);
                pst.setString(1, name);
                pst.setString(2, pw);
            
                    rs=pst.executeQuery();
                    
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null,"username and password correct");
                    rs.close();
                    pst.close();
                
                            AdminOption ob=new AdminOption();
                            ob.setVisible(true);
                            this.setVisible(false);
                            dispose(); 
                
                 } else {
                JOptionPane.showMessageDialog(null, "incrroect");
                 }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminoptionenter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtpw;
    private javax.swing.JTextField txtuname;
    // End of variables declaration//GEN-END:variables
}
