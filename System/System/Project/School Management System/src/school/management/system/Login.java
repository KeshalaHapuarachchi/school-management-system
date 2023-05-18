
package school.management.system;
import java.awt.Color;
import java.awt.Toolkit;
 import java.sql.*;
import javax.swing.*;

public class Login extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;

    public Login() {
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
        btnLogin = new javax.swing.JButton();
        btnOPtion = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtpw = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Admin Login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(377, 22, 441, 56);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("User Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(377, 206, 69, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(377, 269, 61, 17);

        txtuname.setColumns(15);
        getContentPane().add(txtuname);
        txtuname.setBounds(600, 205, 201, 20);

        btnLogin.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        btnLogin.setBorder(null);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(601, 393, 200, 50);

        btnOPtion.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnOPtion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/option.png"))); // NOI18N
        btnOPtion.setBorder(null);
        btnOPtion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOPtion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOPtionActionPerformed(evt);
            }
        });
        getContentPane().add(btnOPtion);
        btnOPtion.setBounds(479, 393, 50, 50);

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
        btnExit.setBounds(1306, 11, 50, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(960, 360, 400, 400);
        getContentPane().add(txtpw);
        txtpw.setBounds(600, 270, 200, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
 
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnOPtionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOPtionActionPerformed
        
        
        adminoptionenter ob=new adminoptionenter();
        ob.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnOPtionActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
     String name = txtuname.getText();
     String pw   = txtpw.getText();
     String q    = "Select * from admin where uname=? and pword=?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmsdb","root","");
            pst=con.prepareStatement(q);
            pst.setString(1, name);
            pst.setString(2, pw);
            
            rs=pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null,"username and password correct");
                rs.close();
                pst.close();
                
                MainMenu ob=new MainMenu();
                ob.setVisible(true);
                this.setVisible(false);
                dispose();
                
            } else {
                JOptionPane.showMessageDialog(null, "incrroect");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        

    }//GEN-LAST:event_btnLoginActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnOPtion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtpw;
    private javax.swing.JTextField txtuname;
    // End of variables declaration//GEN-END:variables
}
