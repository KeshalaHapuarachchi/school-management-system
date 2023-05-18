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
@Table(name = "teacher", catalog = "schoolmsdb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Teacher.findAll", query = "SELECT t FROM Teacher t")
    , @NamedQuery(name = "Teacher.findByTId", query = "SELECT t FROM Teacher t WHERE t.tId = :tId")
    , @NamedQuery(name = "Teacher.findByFName", query = "SELECT t FROM Teacher t WHERE t.fName = :fName")
    , @NamedQuery(name = "Teacher.findByLName", query = "SELECT t FROM Teacher t WHERE t.lName = :lName")
    , @NamedQuery(name = "Teacher.findByFullName", query = "SELECT t FROM Teacher t WHERE t.fullName = :fullName")
    , @NamedQuery(name = "Teacher.findByAge", query = "SELECT t FROM Teacher t WHERE t.age = :age")
    , @NamedQuery(name = "Teacher.findByDob", query = "SELECT t FROM Teacher t WHERE t.dob = :dob")
    , @NamedQuery(name = "Teacher.findByGender", query = "SELECT t FROM Teacher t WHERE t.gender = :gender")
    , @NamedQuery(name = "Teacher.findByTp", query = "SELECT t FROM Teacher t WHERE t.tp = :tp")
    , @NamedQuery(name = "Teacher.findByAddress", query = "SELECT t FROM Teacher t WHERE t.address = :address")
    , @NamedQuery(name = "Teacher.findByMarage", query = "SELECT t FROM Teacher t WHERE t.marage = :marage")
    , @NamedQuery(name = "Teacher.findByAcNo", query = "SELECT t FROM Teacher t WHERE t.acNo = :acNo")
    , @NamedQuery(name = "Teacher.findByBank", query = "SELECT t FROM Teacher t WHERE t.bank = :bank")
    , @NamedQuery(name = "Teacher.findBySubject", query = "SELECT t FROM Teacher t WHERE t.subject = :subject")
    , @NamedQuery(name = "Teacher.findByNic", query = "SELECT t FROM Teacher t WHERE t.nic = :nic")})
public class Teacher implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "t_id")
    private String tId;
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
    @Column(name = "age")
    private int age;
    @Basic(optional = false)
    @Column(name = "dob")
    private String dob;
    @Basic(optional = false)
    @Column(name = "gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "tp")
    private String tp;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Column(name = "marage")
    private String marage;
    @Basic(optional = false)
    @Column(name = "ac_no")
    private String acNo;
    @Basic(optional = false)
    @Column(name = "bank")
    private String bank;
    @Basic(optional = false)
    @Column(name = "subject")
    private String subject;
    @Basic(optional = false)
    @Column(name = "nic")
    private String nic;

    public Teacher() {
    }

    public Teacher(String tId) {
        this.tId = tId;
    }

    public Teacher(String tId, String fName, String lName, String fullName, int age, String dob, String gender, String tp, String address, String marage, String acNo, String bank, String subject, String nic) {
        this.tId = tId;
        this.fName = fName;
        this.lName = lName;
        this.fullName = fullName;
        this.age = age;
        this.dob = dob;
        this.gender = gender;
        this.tp = tp;
        this.address = address;
        this.marage = marage;
        this.acNo = acNo;
        this.bank = bank;
        this.subject = subject;
        this.nic = nic;
    }

    public String getTId() {
        return tId;
    }

    public void setTId(String tId) {
        String oldTId = this.tId;
        this.tId = tId;
        changeSupport.firePropertyChange("TId", oldTId, tId);
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

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        String oldTp = this.tp;
        this.tp = tp;
        changeSupport.firePropertyChange("tp", oldTp, tp);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getMarage() {
        return marage;
    }

    public void setMarage(String marage) {
        String oldMarage = this.marage;
        this.marage = marage;
        changeSupport.firePropertyChange("marage", oldMarage, marage);
    }

    public String getAcNo() {
        return acNo;
    }

    public void setAcNo(String acNo) {
        String oldAcNo = this.acNo;
        this.acNo = acNo;
        changeSupport.firePropertyChange("acNo", oldAcNo, acNo);
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        String oldBank = this.bank;
        this.bank = bank;
        changeSupport.firePropertyChange("bank", oldBank, bank);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        String oldSubject = this.subject;
        this.subject = subject;
        changeSupport.firePropertyChange("subject", oldSubject, subject);
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        String oldNic = this.nic;
        this.nic = nic;
        changeSupport.firePropertyChange("nic", oldNic, nic);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tId != null ? tId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Teacher)) {
            return false;
        }
        Teacher other = (Teacher) object;
        if ((this.tId == null && other.tId != null) || (this.tId != null && !this.tId.equals(other.tId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "school.management.system.Teacher[ tId=" + tId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
