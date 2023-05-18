
package school.management.system;

import java.awt.Color;
import java.awt.Toolkit;

public class AdminOption extends javax.swing.JFrame {

    public AdminOption() {
       //      this.setUndecorated(true);
        this.setAlwaysOnTop(false);
        this.setResizable(false);
        this.setVisible(true);
          
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
        btnRadmin = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btncpwd = new javax.swing.JButton();
        btnNadmin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Option");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setFocusable(false);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Admin Option");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(470, 10, 290, 60);

        btnRadmin.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnRadmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove person.jpg"))); // NOI18N
        btnRadmin.setBorder(null);
        btnRadmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadminActionPerformed(evt);
            }
        });
        getContentPane().add(btnRadmin);
        btnRadmin.setBounds(798, 220, 190, 200);

        btnBack.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.jpg"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(10, 11, 50, 50);

        btncpwd.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btncpwd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update person.jpg"))); // NOI18N
        btncpwd.setBorder(null);
        btncpwd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncpwdActionPerformed(evt);
            }
        });
        getContentPane().add(btncpwd);
        btncpwd.setBounds(441, 220, 190, 200);

        btnNadmin.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnNadmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add person.jpg"))); // NOI18N
        btnNadmin.setBorder(null);
        btnNadmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNadminActionPerformed(evt);
            }
        });
        getContentPane().add(btnNadmin);
        btnNadmin.setBounds(111, 220, 180, 200);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin option.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(960, 350, 400, 400);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("Add Admin");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(111, 464, 85, 22);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("Change Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(441, 464, 147, 22);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Remove Admin");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(798, 464, 120, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Login ob= new Login();
        ob.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNadminActionPerformed
     Addadmin ob=new Addadmin();
      ob.setVisible(true);
      this.setVisible(false);
      dispose();
    }//GEN-LAST:event_btnNadminActionPerformed

    private void btncpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncpwdActionPerformed
        Changepw ob=new Changepw();
        ob.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btncpwdActionPerformed

    private void btnRadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadminActionPerformed
        Yourlog ob=new Yourlog();
        ob.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnRadminActionPerformed

  
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOption().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNadmin;
    private javax.swing.JButton btnRadmin;
    private javax.swing.JButton btncpwd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
