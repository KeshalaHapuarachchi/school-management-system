/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.management.system;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Isuru
 */
@Entity
@Table(name = "student", catalog = "schoolmsdb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s")
    , @NamedQuery(name = "Student.findBySId", query = "SELECT s FROM Student s WHERE s.sId = :sId")
    , @NamedQuery(name = "Student.findByFName", query = "SELECT s FROM Student s WHERE s.fName = :fName")
    , @NamedQuery(name = "Student.findByLName", query = "SELECT s FROM Student s WHERE s.lName = :lName")
    , @NamedQuery(name = "Student.findByFullName", query = "SELECT s FROM Student s WHERE s.fullName = :fullName")
    , @NamedQuery(name = "Student.findByAddress", query = "SELECT s FROM Student s WHERE s.address = :address")
    , @NamedQuery(name = "Student.findByTp", query = "SELECT s FROM Student s WHERE s.tp = :tp")
    , @NamedQuery(name = "Student.findByAge", query = "SELECT s FROM Student s WHERE s.age = :age")
    , @NamedQuery(name = "Student.findByDob", query = "SELECT s FROM Student s WHERE s.dob = :dob")
    , @NamedQuery(name = "Student.findByGender", query = "SELECT s FROM Student s WHERE s.gender = :gender")
    , @NamedQuery(name = "Student.findByOName", query = "SELECT s FROM Student s WHERE s.oName = :oName")
    , @NamedQuery(name = "Student.findByOAddress", query = "SELECT s FROM Student s WHERE s.oAddress = :oAddress")
    , @NamedQuery(name = "Student.findByOTp", query = "SELECT s FROM Student s WHERE s.oTp = :oTp")
    , @NamedQuery(name = "Student.findByCategory", query = "SELECT s FROM Student s WHERE s.category = :category")
    , @NamedQuery(name = "Student.findByClass1", query = "SELECT s FROM Student s WHERE s.class1 = :class1")
    , @NamedQuery(name = "Student.findByClassTeacher", query = "SELECT s FROM Student s WHERE s.classTeacher = :classTeacher")
    , @NamedQuery(name = "Student.findByFileNo", query = "SELECT s FROM Student s WHERE s.fileNo = :fileNo")})
public class Student implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "s_id")
    private String sId;
    @Basic(optional = false)
    @Column(name = "f_name")
    private String fName;
    @Basic(optional = false)
    @Column(name = "l_name")
    private String lName;
    @Basic(optional = false)
    @Column(name = "full_name")
    private String fullName;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Column(name = "tp")
    private String tp;
    @Basic(optional = false)
    @Column(name = "age")
    private int age;
    @Basic(optional = false)
    @Column(name = "dob")
    private String dob;
    @Basic(optional = false)
    @Column(name = "gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "o_name")
    private String oName;
    @Basic(optional = false)
    @Column(name = "o_address")
    private String oAddress;
    @Basic(optional = false)
    @Column(name = "o_tp")
    private String oTp;
    @Basic(optional = false)
    @Column(name = "category")
    private String category;
    @Basic(optional = false)
    @Column(name = "class")
    private String class1;
    @Basic(optional = false)
    @Column(name = "class_teacher")
    private String classTeacher;
    @Basic(optional = false)
    @Column(name = "file_no")
    private String fileNo;

    public Student() {
    }

    public Student(String sId) {
        this.sId = sId;
    }

    public Student(String sId, String fName, String lName, String fullName, String address, String tp, int age, String dob, String gender, String oName, String oAddress, String oTp, String category, String class1, String classTeacher, String fileNo) {
        this.sId = sId;
        this.fName = fName;
        this.lName = lName;
        this.fullName = fullName;
        this.address = address;
        this.tp = tp;
        this.age = age;
        this.dob = dob;
        this.gender = gender;
        this.oName = oName;
        this.oAddress = oAddress;
        this.oTp = oTp;
        this.category = category;
        this.class1 = class1;
        this.classTeacher = classTeacher;
        this.fileNo = fileNo;
    }

    public String getSId() {
        return sId;
    }

    public void setSId(String sId) {
        String oldSId = this.sId;
        this.sId = sId;
        changeSupport.firePropertyChange("SId", oldSId, sId);
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        String oldFName = this.fName;
        this.fName = fName;
        changeSupport.firePropertyChange("FName", oldFName, fName);
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        String oldLName = this.lName;
        this.lName = lName;
        changeSupport.firePropertyChange("LName", oldLName, lName);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        String oldFullName = this.fullName;
        this.fullName = fullName;
        changeSupport.firePropertyChange("fullName", oldFullName, fullName);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        String oldTp = this.tp;
        this.tp = tp;
        changeSupport.firePropertyChange("tp", oldTp, tp);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        int oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        String oldDob = this.dob;
        this.dob = dob;
        changeSupport.firePropertyChange("dob", oldDob, dob);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getOName() {
        return oName;
    }

    public void setOName(String oName) {
        String oldOName = this.oName;
        this.oName = oName;
        changeSupport.firePropertyChange("OName", oldOName, oName);
    }

    public String getOAddress() {
        return oAddress;
    }

    public void setOAddress(String oAddress) {
        String oldOAddress = this.oAddress;
        this.oAddress = oAddress;
        changeSupport.firePropertyChange("OAddress", oldOAddress, oAddress);
    }

    public String getOTp() {
        return oTp;
    }

    public void setOTp(String oTp) {
        String oldOTp = this.oTp;
        this.oTp = oTp;
        changeSupport.firePropertyChange("OTp", oldOTp, oTp);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        String oldCategory = this.category;
        this.category = category;
        changeSupport.firePropertyChange("category", oldCategory, category);
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        String oldClass1 = this.class1;
        this.class1 = class1;
        changeSupport.firePropertyChange("class1", oldClass1, class1);
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        String oldClassTeacher = this.classTeacher;
        this.classTeacher = classTeacher;
        changeSupport.firePropertyChange("classTeacher", oldClassTeacher, classTeacher);
    }

    public String getFileNo() {
        return fileNo;
    }

    public void setFileNo(String fileNo) {
        String oldFileNo = this.fileNo;
        this.fileNo = fileNo;
        changeSupport.firePropertyChange("fileNo", oldFileNo, fileNo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sId != null ? sId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.sId == null && other.sId != null) || (this.sId != null && !this.sId.equals(other.sId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "school.management.system.Student[ sId=" + sId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
