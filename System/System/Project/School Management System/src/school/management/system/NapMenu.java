
package school.management.system;

import java.awt.Color;
import java.awt.Toolkit;

public class NapMenu extends javax.swing.JFrame {

    public NapMenu() {
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
        btnNregister = new javax.swing.JButton();
        btnNsearch = new javax.swing.JButton();
        btnNupdate = new javax.swing.JButton();
        btnTremove = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnExit1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Non Acadamic Persons Menu");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(370, 10, 666, 50);

        btnNregister.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNregister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add person.jpg"))); // NOI18N
        btnNregister.setBorder(null);
        btnNregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNregisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnNregister);
        btnNregister.setBounds(90, 130, 200, 200);

        btnNsearch.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search persons.jpg"))); // NOI18N
        btnNsearch.setBorder(null);
        btnNsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnNsearch);
        btnNsearch.setBounds(730, 130, 200, 200);

        btnNupdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update person.jpg"))); // NOI18N
        btnNupdate.setBorder(null);
        btnNupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnNupdate);
        btnNupdate.setBounds(400, 130, 200, 200);

        btnTremove.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTremove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove person.jpg"))); // NOI18N
        btnTremove.setBorder(null);
        btnTremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTremoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnTremove);
        btnTremove.setBounds(1060, 130, 200, 200);

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

        btnExit1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.jpg"))); // NOI18N
        btnExit1.setBorder(null);
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit1);
        btnExit1.setBounds(1310, 0, 50, 50);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("Register NAP");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 350, 108, 22);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("Update NAP");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(410, 350, 99, 22);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Search NAP");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(740, 350, 98, 22);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("Remove NAP");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1060, 350, 107, 22);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nap menu.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(960, 360, 400, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNregisterActionPerformed
             
        NAPform ob =new NAPform();
        ob.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnNregisterActionPerformed

    private void btnNsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNsearchActionPerformed
        Napsearch ob =new Napsearch();
        ob.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnNsearchActionPerformed

    private void btnNupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNupdateActionPerformed
        updatenap ob =new updatenap();
        ob.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnNupdateActionPerformed

    private void btnTremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTremoveActionPerformed

        RemoveNap ob =new RemoveNap();
        ob.setVisible(true);

    }//GEN-LAST:event_btnTremoveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MainMenu ob =new MainMenu();
        ob.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed

        System.exit(0);
    }//GEN-LAST:event_btnExit1ActionPerformed

  
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NapMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnNregister;
    private javax.swing.JButton btnNsearch;
    private javax.swing.JButton btnNupdate;
    private javax.swing.JButton btnTremove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
