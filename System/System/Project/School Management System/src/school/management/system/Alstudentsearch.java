
package school.management.system;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;



public class Alstudentsearch extends javax.swing.JFrame {
Connection          con = null;
ResultSet           rs  = null;
PreparedStatement   pst = null;
    public Alstudentsearch() {
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
        alttQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT a FROM Altt a");
        alttList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : alttQuery.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txts = new javax.swing.JTextField();
        btnremove = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtf = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtcls = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Search A/L Studets");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Student ID No :-");

        txts.setColumns(15);
        txts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsActionPerformed(evt);
            }
        });

        btnremove.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnremove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnremove.setBorder(null);
        btnremove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnremove.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnremoveMouseMoved(evt);
            }
        });
        btnremove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnremoveMouseClicked(evt);
            }
        });
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Studets Details :-");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Exam Details :-");

        btnBack.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.jpg"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtf.setBackground(new java.awt.Color(204, 255, 255));
        txtf.setColumns(20);
        txtf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtf.setForeground(new java.awt.Color(0, 0, 204));
        txtf.setRows(5);
        txtf.setBorder(null);
        txtf.setPreferredSize(new java.awt.Dimension(500, 400));
        jScrollPane3.setViewportView(txtf);

        jTable1.setBackground(new java.awt.Color(204, 255, 255));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, alttList, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${SId}"));
        columnBinding.setColumnName("SId");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${year}"));
        columnBinding.setColumnName("Year");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${semester}"));
        columnBinding.setColumnName("Semester");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${avg}"));
        columnBinding.setColumnName("Avg");
        columnBinding.setColumnClass(Float.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${place}"));
        columnBinding.setColumnName("Place");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${subI}"));
        columnBinding.setColumnName("Sub I");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${subIi}"));
        columnBinding.setColumnName("Sub Ii");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${subIii}"));
        columnBinding.setColumnName("Sub Iii");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${english}"));
        columnBinding.setColumnName("English");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTable1);

        txtcls.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.png"))); // NOI18N
        txtcls.setBorder(null);
        txtcls.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtcls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(300, 300, 300)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(txts, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnremove, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(txtcls, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcls, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnremove, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(136, 136, 136)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
            String id =txts.getText();
     String sql="select * from student where s_id ='"+id+"'";
     
        try {
           pst=con.prepareStatement(sql);
           rs=pst.executeQuery();
           //set details to the texarea
           while(rs.next()){
     String ids         =rs.getString("s_id");
     String fname       =rs.getString("f_name");
     String lname       =rs.getString("l_name");
     String fullname    =rs.getString("full_name");
     String saddress    =rs.getString("address");
     String stp         =rs.getString("tp");
     String age         =rs.getString("age");
     String dob         =rs.getString("dob");
     String gender      =rs.getString("gender");
     String oname       =rs.getString("o_name");
     String oaddress    =rs.getString("o_address");
     String otp         =rs.getString("o_tp");
     String catgory     =rs.getString("category");
     String cls         =rs.getString("class");
     String clsteacher  =rs.getString("class_teacher");
     String fileno      =rs.getString("file_no");
  
     txtf.append(
     "Student Id number : "+ids+"\n\n"
     +"First Name       : "+fname+"\n"
     +"Last Name        : "+lname+"\n"
     +"Full Name        : "+fullname+"\n"
     +"Student Address  : "+saddress+"\n"
     +"Student TP       :"+stp+"\n"
     +"Age              : "+age+"\n"
     +"Date of Birth    :"+dob+"\n"
     +"Gender           : "+gender+"\n\n"
     +"Oner Name        : "+oname+"\n"
     +"Oner Address     : "+oaddress+"\n"
     +"Oner TP          : "+otp+"\n\n"
     +"Class Catagory   : "+catgory+"\n"
     +"Class            : "+cls+"\n"
     +"Calss Teacher    : "+clsteacher+"\n"
     +"File No          : "+fileno+"");
           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
          String x = txts.getText();
        String sq="select * from altt where s_id like '%"+x+"%'";
        try {
           pst=con.prepareStatement(sq);
           rs=pst.executeQuery();
          jTable1.setModel(DbUtils.resultSetToTableModel(rs));
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
                    }
    }//GEN-LAST:event_btnremoveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        StudentMenu ob=new StudentMenu();
        ob.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnremoveMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnremoveMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnremoveMouseMoved

    private void btnremoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnremoveMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnremoveMouseClicked

    private void txtclsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclsActionPerformed
      txtf.setText("");
     
    }//GEN-LAST:event_txtclsActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alstudentsearch().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<school.management.system.Altt> alttList;
    private javax.persistence.Query alttQuery;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnremove;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton txtcls;
    private javax.swing.JTextArea txtf;
    private javax.swing.JTextField txts;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
