
package school.management.system;

import java.awt.Color;
import java.awt.Toolkit;


public class TeacherMenu extends javax.swing.JFrame {

    public TeacherMenu() {
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

        btnTregister = new javax.swing.JButton();
        btnTsearch = new javax.swing.JButton();
        btnTupdate = new javax.swing.JButton();
        btnTremove = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        getContentPane().setLayout(null);

        btnTregister.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTregister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add person.jpg"))); // NOI18N
        btnTregister.setBorder(null);
        btnTregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTregisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnTregister);
        btnTregister.setBounds(90, 130, 200, 200);

        btnTsearch.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search persons.jpg"))); // NOI18N
        btnTsearch.setBorder(null);
        btnTsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnTsearch);
        btnTsearch.setBounds(740, 130, 200, 200);

        btnTupdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update person.jpg"))); // NOI18N
        btnTupdate.setBorder(null);
        btnTupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnTupdate);
        btnTupdate.setBounds(410, 130, 200, 200);

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
        btnBack.setBounds(10, 20, 50, 50);

        btnExit.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.jpg"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(1306, 20, 50, 50);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Teachers Menu");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(528, 20, 346, 56);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("Register Teachers");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 350, 148, 22);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("Update Teachers");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(410, 350, 139, 22);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("Search Teachers");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(740, 350, 138, 22);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Remove Teachers");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(1060, 350, 147, 22);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/teachers menu.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(960, 360, 400, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTregisterActionPerformed
            TeachersForm ob=new TeachersForm();
            ob.setVisible(true);
            this.setVisible(false);
            dispose();
    }//GEN-LAST:event_btnTregisterActionPerformed

    private void btnTsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTsearchActionPerformed
               TSearch ob=new TSearch();
               ob.setVisible(true);
               this.setVisible(false);
               dispose();
    }//GEN-LAST:event_btnTsearchActionPerformed

    private void btnTupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTupdateActionPerformed
            upadateteacher ob=new upadateteacher();
            ob.setVisible(true);
            this.setVisible(false);
            dispose();
    }//GEN-LAST:event_btnTupdateActionPerformed

    private void btnTremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTremoveActionPerformed
        RemoveTacher ob= new RemoveTacher();
        ob.setVisible(true);

    }//GEN-LAST:event_btnTremoveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MainMenu ob =new MainMenu();
        ob.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
     
        System.exit(0);
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
            java.util.logging.Logger.getLogger(TeacherMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnTregister;
    private javax.swing.JButton btnTremove;
    private javax.swing.JButton btnTsearch;
    private javax.swing.JButton btnTupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
