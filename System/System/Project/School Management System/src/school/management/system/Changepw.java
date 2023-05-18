
package school.management.system;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.*;
public class Changepw extends javax.swing.JFrame {
            Connection          con =null;
            ResultSet           rs  =null;
            PreparedStatement   pst =null;
    public Changepw() {
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
        jLabel4 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtcurent = new javax.swing.JPasswordField();
        txtnew = new javax.swing.JPasswordField();
        btnchange = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Admin Id");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(421, 191, 66, 17);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Change password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(421, 14, 412, 64);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Curent password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(421, 248, 107, 17);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("New password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(421, 300, 90, 17);

        txtid.setColumns(5);
        getContentPane().add(txtid);
        txtid.setBounds(596, 190, 200, 20);

        txtcurent.setColumns(15);
        txtcurent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcurentActionPerformed(evt);
            }
        });
        getContentPane().add(txtcurent);
        txtcurent.setBounds(596, 247, 200, 20);

        txtnew.setColumns(15);
        getContentPane().add(txtnew);
        txtnew.setBounds(596, 299, 200, 20);

        btnchange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change.png"))); // NOI18N
        btnchange.setBorder(null);
        btnchange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchangeActionPerformed(evt);
            }
        });
        getContentPane().add(btnchange);
        btnchange.setBounds(596, 370, 200, 50);

        btnBack1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.jpg"))); // NOI18N
        btnBack1.setBorder(null);
        btnBack1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack1.setPreferredSize(new java.awt.Dimension(50, 50));
        btnBack1.setRequestFocusEnabled(false);
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack1);
        btnBack1.setBounds(10, 14, 50, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change password.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(960, 360, 400, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        AdminOption ob=new AdminOption();
        ob.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnchangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchangeActionPerformed
                int x = JOptionPane.showConfirmDialog(null,"Are you shur ??");
        if (x==0) {
             String id= txtid.getText();
           String curent=txtcurent.getText();
            
           String q="select * from admin where pword=?";

               try {
                                     
            pst=con.prepareStatement(q);
            pst.setString(1, curent);  
            
            rs=pst.executeQuery();
                    
                    if (rs.next()) {
                   String newpw=txtnew.getText();    
                   String sql= "UPDATE admin set pword='"+newpw+"' where a_id ='"+id+"' ";
                   pst=con.prepareStatement(sql);
                   pst.execute();
                   JOptionPane.showMessageDialog(null, "Updated");

                   rs.close();
                   pst.close();
                       
                    } else {
                          JOptionPane.showMessageDialog(null, "incorrect");
                    }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        } else {
        }
       
    }//GEN-LAST:event_btnchangeActionPerformed

    private void txtcurentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcurentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcurentActionPerformed

   
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Changepw().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnchange;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtcurent;
    private javax.swing.JTextField txtid;
    private javax.swing.JPasswordField txtnew;
    // End of variables declaration//GEN-END:variables
}
