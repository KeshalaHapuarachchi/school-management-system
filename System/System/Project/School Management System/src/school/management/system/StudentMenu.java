
package school.management.system;

import java.awt.Color;
import java.awt.Toolkit;


public class StudentMenu extends javax.swing.JFrame {


    public StudentMenu() {
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
        btnSregister = new javax.swing.JButton();
        btnSsearch = new javax.swing.JButton();
        btnSupdate = new javax.swing.JButton();
        btnSremove = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Student Menu");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(463, 11, 460, 56);

        btnSregister.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSregister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add person.jpg"))); // NOI18N
        btnSregister.setBorder(null);
        btnSregister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSregisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnSregister);
        btnSregister.setBounds(30, 140, 200, 200);

        btnSsearch.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search persons.jpg"))); // NOI18N
        btnSsearch.setBorder(null);
        btnSsearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSsearch);
        btnSsearch.setBounds(710, 140, 200, 200);

        btnSupdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update person.jpg"))); // NOI18N
        btnSupdate.setBorder(null);
        btnSupdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnSupdate);
        btnSupdate.setBounds(360, 140, 200, 200);

        btnSremove.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSremove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove person.jpg"))); // NOI18N
        btnSremove.setBorder(null);
        btnSremove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSremoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSremove);
        btnSremove.setBounds(1030, 140, 200, 200);

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

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("Register Students");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 370, 160, 22);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setText("Upate Students");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 370, 124, 22);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("Remove Students");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1050, 370, 142, 22);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("Search Students");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(730, 370, 133, 22);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/student menu.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(960, 360, 400, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSsearchActionPerformed
        SsrchCatalog ob=new SsrchCatalog();
        ob.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnSsearchActionPerformed

    private void btnSupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupdateActionPerformed
    Studentupdate ob=new Studentupdate();
    ob.setVisible(true);
    this.setVisible(false);
    dispose();
    }//GEN-LAST:event_btnSupdateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

     System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MainMenu ob =new MainMenu();
        ob.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSregisterActionPerformed
        
        StudentForm ob =new StudentForm();
        ob.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnSregisterActionPerformed

    private void btnSremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSremoveActionPerformed
      RemoveStu ob =new RemoveStu();
      ob.setVisible(true);

    }//GEN-LAST:event_btnSremoveActionPerformed

 
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSregister;
    private javax.swing.JButton btnSremove;
    private javax.swing.JButton btnSsearch;
    private javax.swing.JButton btnSupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
