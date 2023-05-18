
package school.management.system;

import java.awt.Color;
import java.awt.Toolkit;


public class Exammenu extends javax.swing.JFrame {


    public Exammenu() {
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
        btnStudent = new javax.swing.JButton();
        btnTeachers = new javax.swing.JButton();
        btnNonedu = new javax.swing.JButton();
        btnExam = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnExit1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Exam Menu");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(540, 10, 265, 56);

        btnStudent.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addtt.png"))); // NOI18N
        btnStudent.setBorder(null);
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });
        getContentPane().add(btnStudent);
        btnStudent.setBounds(150, 150, 400, 50);

        btnTeachers.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTeachers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grade5.png"))); // NOI18N
        btnTeachers.setBorder(null);
        btnTeachers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeachersActionPerformed(evt);
            }
        });
        getContentPane().add(btnTeachers);
        btnTeachers.setBounds(150, 300, 400, 50);

        btnNonedu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNonedu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gceol.png"))); // NOI18N
        btnNonedu.setBorder(null);
        btnNonedu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoneduActionPerformed(evt);
            }
        });
        getContentPane().add(btnNonedu);
        btnNonedu.setBounds(780, 150, 400, 50);

        btnExam.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gceal.png"))); // NOI18N
        btnExam.setBorder(null);
        btnExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExamActionPerformed(evt);
            }
        });
        getContentPane().add(btnExam);
        btnExam.setBounds(780, 300, 400, 50);

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exam menu.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(960, 340, 400, 400);

        btnExit1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.jpg"))); // NOI18N
        btnExit1.setBorder(null);
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit1);
        btnExit1.setBounds(1310, 10, 50, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        ExamCatagory ob=new ExamCatagory();
        ob.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnStudentActionPerformed

    private void btnTeachersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeachersActionPerformed
        Grade5exam ob=new Grade5exam();
        ob.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnTeachersActionPerformed

    private void btnNoneduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoneduActionPerformed
        GCEOlExam ob=new GCEOlExam();
        ob.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnNoneduActionPerformed

    private void btnExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExamActionPerformed
        GCEAlExam ob=new GCEAlExam();
        ob.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnExamActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MainMenu ob =new MainMenu();
        ob.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed

        System.exit(0);
    }//GEN-LAST:event_btnExit1ActionPerformed

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
            java.util.logging.Logger.getLogger(Exammenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exammenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exammenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exammenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exammenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExam;
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnNonedu;
    private javax.swing.JButton btnStudent;
    private javax.swing.JButton btnTeachers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
