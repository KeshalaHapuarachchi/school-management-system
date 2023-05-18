package school.management.system;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class StudentForm extends javax.swing.JFrame {
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    public StudentForm() {
        
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
         Update_table();
    }
        private void Update_table(){
        try{
            String sql="Select * from student";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            tstu.setModel(DbUtils.resultSetToTableModel(rs));
        }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("schoolmsdb?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        studentQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT s FROM Student s");
        studentList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : studentQuery.getResultList();
        studentQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT s FROM Student s");
        studentList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : studentQuery1.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtFullname = new javax.swing.JTextField();
        txtSaddress = new javax.swing.JTextField();
        txtStp = new javax.swing.JFormattedTextField();
        txtAge = new javax.swing.JTextField();
        txtDob = new javax.swing.JFormattedTextField();
        cmbGender = new javax.swing.JComboBox();
        txtOname = new javax.swing.JTextField();
        txtOAddress = new javax.swing.JTextField();
        txtOtp = new javax.swing.JFormattedTextField();
        cmbCatalog = new javax.swing.JComboBox();
        txtClass = new javax.swing.JTextField();
        txtCtname = new javax.swing.JTextField();
        txtFno = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtsid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tstu = new javax.swing.JTable();
        btnExit1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnclear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Student Form");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(527, 3, 371, 47);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Fitst Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(24, 143, 67, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Last Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(24, 180, 67, 17);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Full Nmae");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(24, 215, 63, 17);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Address");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(24, 256, 52, 17);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("T.P");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(24, 294, 22, 17);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Age");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(24, 332, 25, 17);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("DOB");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(24, 370, 30, 17);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(24, 407, 48, 17);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Oner Name");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(725, 107, 72, 17);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Oner Address");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(725, 143, 88, 17);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Oner T.P");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(725, 181, 58, 17);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Catagory");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(725, 219, 58, 17);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Class");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(725, 257, 35, 17);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("Class Teacher");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(725, 295, 92, 17);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("File No");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(725, 333, 44, 17);

        txtFname.setColumns(20);
        txtFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtFname);
        txtFname.setBounds(235, 142, 166, 20);

        txtLname.setColumns(20);
        txtLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtLname);
        txtLname.setBounds(235, 177, 166, 20);

        txtFullname.setColumns(80);
        txtFullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtFullname);
        txtFullname.setBounds(235, 215, 435, 20);

        txtSaddress.setColumns(80);
        txtSaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaddressActionPerformed(evt);
            }
        });
        getContentPane().add(txtSaddress);
        txtSaddress.setBounds(235, 255, 435, 20);

        txtStp.setColumns(12);
        txtStp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStpActionPerformed(evt);
            }
        });
        getContentPane().add(txtStp);
        txtStp.setBounds(235, 293, 102, 20);

        txtAge.setColumns(3);
        getContentPane().add(txtAge);
        txtAge.setBounds(235, 331, 102, 20);

        txtDob.setColumns(10);
        getContentPane().add(txtDob);
        txtDob.setBounds(235, 369, 102, 20);

        cmbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        getContentPane().add(cmbGender);
        cmbGender.setBounds(235, 404, 102, 20);

        txtOname.setColumns(50);
        getContentPane().add(txtOname);
        txtOname.setBounds(901, 104, 359, 20);

        txtOAddress.setColumns(50);
        getContentPane().add(txtOAddress);
        txtOAddress.setBounds(901, 142, 359, 20);

        txtOtp.setColumns(15);
        txtOtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOtpActionPerformed(evt);
            }
        });
        getContentPane().add(txtOtp);
        txtOtp.setBounds(901, 180, 102, 20);

        cmbCatalog.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Primary", "O/L", "A/L" }));
        getContentPane().add(cmbCatalog);
        cmbCatalog.setBounds(901, 218, 102, 20);

        txtClass.setColumns(5);
        getContentPane().add(txtClass);
        txtClass.setBounds(901, 256, 102, 20);

        txtCtname.setColumns(50);
        getContentPane().add(txtCtname);
        txtCtname.setBounds(901, 294, 359, 20);

        txtFno.setColumns(10);
        getContentPane().add(txtFno);
        txtFno.setBounds(901, 332, 102, 20);

        btnSave.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnSave.setBorder(null);
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(790, 380, 50, 50);

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

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setText("ID No");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(24, 105, 42, 17);

        txtsid.setColumns(10);
        txtsid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsidActionPerformed(evt);
            }
        });
        txtsid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsidKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsidKeyTyped(evt);
            }
        });
        getContentPane().add(txtsid);
        txtsid.setBounds(235, 104, 166, 20);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, studentList1, tstu);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${SId}"));
        columnBinding.setColumnName("SId");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${FName}"));
        columnBinding.setColumnName("FName");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${LName}"));
        columnBinding.setColumnName("LName");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fullName}"));
        columnBinding.setColumnName("Full Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${address}"));
        columnBinding.setColumnName("Address");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tp}"));
        columnBinding.setColumnName("Tp");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${age}"));
        columnBinding.setColumnName("Age");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dob}"));
        columnBinding.setColumnName("Dob");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${gender}"));
        columnBinding.setColumnName("Gender");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${OName}"));
        columnBinding.setColumnName("OName");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${OAddress}"));
        columnBinding.setColumnName("OAddress");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${OTp}"));
        columnBinding.setColumnName("OTp");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${category}"));
        columnBinding.setColumnName("Category");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${class1}"));
        columnBinding.setColumnName("Class1");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${classTeacher}"));
        columnBinding.setColumnName("Class Teacher");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fileNo}"));
        columnBinding.setColumnName("File No");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        tstu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tstuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tstu);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 480, 1320, 185);

        btnExit1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btnExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.jpg"))); // NOI18N
        btnExit1.setBorder(null);
        btnExit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit1);
        btnExit1.setBounds(1297, 11, 50, 50);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/student menu.jpg"))); // NOI18N
        getContentPane().add(jLabel18);
        jLabel18.setBounds(0, 80, 400, 400);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add menu.jpg"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(960, 80, 400, 400);

        btnclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.png"))); // NOI18N
        btnclear.setBorder(null);
        btnclear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear);
        btnclear.setBounds(720, 380, 50, 50);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFnameActionPerformed
      
    }//GEN-LAST:event_txtFnameActionPerformed

    private void txtFullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullnameActionPerformed
        
    }//GEN-LAST:event_txtFullnameActionPerformed

    private void txtLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLnameActionPerformed
        
    }//GEN-LAST:event_txtLnameActionPerformed

    private void txtStpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStpActionPerformed
       
    }//GEN-LAST:event_txtStpActionPerformed

    private void txtOtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOtpActionPerformed
       
    }//GEN-LAST:event_txtOtpActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
     String id          =txtsid.getText();
     String fname       =txtFname.getText();
     String lname       =txtLname.getText();
     String fullname    =txtFullname.getText();
     String saddress    =txtSaddress.getText();
     String stp         =txtStp.getText();
     String age         =txtAge.getText();
     String dob         =txtDob.getText();
     String gender      =cmbGender.getSelectedItem().toString();
     String oname       =txtOname.getText();
     String oaddress    = txtOAddress.getText();
     String otp         =txtOtp.getText();
     String catgory     =cmbCatalog.getSelectedItem().toString();
     String cls         =txtClass.getText();
     String clsteacher  =txtCtname.getText();
     String fileno      =txtFno.getText();
     
            try{
            String qry="INSERT INTO student(s_id,f_name,l_name,full_name,address,tp,age,dob,gender,o_name,o_address,o_tp,category,class,class_teacher,file_no) VALUES"
                    + "('"+id+"','"+fname+"','"+lname+"','"+fullname+"','"+saddress+"','"+stp+"','"+age+"','"+dob+"','"+gender+"','"+oname+"','"+oaddress+"','"+otp+"','"+catgory+"','"+cls+"','"+clsteacher+"','"+fileno+"')";
            pst=con.prepareStatement(qry);
                   
     
            pst.execute();
            
            JOptionPane.showMessageDialog(this, "Record sucessfully added");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
            Update_table();
     
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        StudentMenu ob=new StudentMenu();
        ob.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtSaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaddressActionPerformed

    private void txtsidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsidActionPerformed


    }//GEN-LAST:event_txtsidActionPerformed

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnExit1ActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
         txtsid.setText("");
        txtFname.setText("");
        txtLname.setText("");
        txtFullname.setText("");
        txtSaddress.setText("");
        txtStp.setText("");
        txtAge.setText("");
        txtDob.setText("");
        cmbGender.setToolTipText("");
        txtOname.setText("");
        txtOAddress.setText("");
        txtOtp.setText("");
        cmbCatalog.setToolTipText("");
        txtClass.setText("");
        txtCtname.setText("");
        txtFno.setText("");
        
    }//GEN-LAST:event_btnclearActionPerformed

    private void tstuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tstuMouseClicked
       int row=tstu.getSelectedRow();
           
     String id          =tstu.getValueAt(row, 0).toString();
     String fname       =tstu.getValueAt(row, 1).toString();
     String lname       =tstu.getValueAt(row, 2).toString();
     String fullname    =tstu.getValueAt(row, 3).toString();
     String saddress    =tstu.getValueAt(row, 4).toString();
     String stp         =tstu.getValueAt(row, 5).toString();
     String age         =tstu.getValueAt(row, 6).toString();
     String dob         =tstu.getValueAt(row, 7).toString();
     String gender      =tstu.getValueAt(row, 8).toString();
     String oname       =tstu.getValueAt(row, 9).toString();
     String oaddress    =tstu.getValueAt(row, 10).toString();
     String otp         =tstu.getValueAt(row, 11).toString();
     String catgory     =tstu.getValueAt(row, 12).toString();
     String cls         =tstu.getValueAt(row, 13).toString();
     String clsteacher  =tstu.getValueAt(row, 14).toString();
     String fileno      =tstu.getValueAt(row, 15).toString();
     
        txtsid.setText(id);
        txtFname.setText(fname);
        txtLname.setText(lname);
        txtFullname.setText(fullname);
        txtSaddress.setText(saddress);
        txtStp.setText(stp);
        txtAge.setText(age);
        txtDob.setText(dob); 
        cmbGender.setSelectedItem(gender);
        txtOname.setText(oname);
        txtOAddress.setText(oaddress);
        cmbCatalog.setSelectedItem(catgory);
        txtOtp.setText(otp);
        txtClass.setText(cls);
        txtCtname.setText(clsteacher);
        txtFno.setText(fileno);
     
    }//GEN-LAST:event_tstuMouseClicked

    private void txtsidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsidKeyTyped
 
                
    }//GEN-LAST:event_txtsidKeyTyped

    private void txtsidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsidKeyReleased
        String x = txtsid.getText();
        String sql="select * from student where s_id like '%"+x+"%'";
        try {
           pst=con.prepareStatement(sql);
           rs=pst.executeQuery();
           tstu.setModel(DbUtils.resultSetToTableModel(rs));
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
                    }
    }//GEN-LAST:event_txtsidKeyReleased


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnclear;
    private javax.swing.JComboBox cmbCatalog;
    private javax.swing.JComboBox cmbGender;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private java.util.List<school.management.system.Student> studentList;
    private java.util.List<school.management.system.Student> studentList1;
    private javax.persistence.Query studentQuery;
    private javax.persistence.Query studentQuery1;
    private javax.swing.JTable tstu;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtClass;
    private javax.swing.JTextField txtCtname;
    private javax.swing.JFormattedTextField txtDob;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtFno;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtOAddress;
    private javax.swing.JTextField txtOname;
    private javax.swing.JFormattedTextField txtOtp;
    private javax.swing.JTextField txtSaddress;
    private javax.swing.JFormattedTextField txtStp;
    private javax.swing.JTextField txtsid;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
