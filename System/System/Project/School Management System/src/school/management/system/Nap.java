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
@Table(name = "nap", catalog = "schoolmsdb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Nap.findAll", query = "SELECT n FROM Nap n")
    , @NamedQuery(name = "Nap.findByNId", query = "SELECT n FROM Nap n WHERE n.nId = :nId")
    , @NamedQuery(name = "Nap.findByFName", query = "SELECT n FROM Nap n WHERE n.fName = :fName")
    , @NamedQuery(name = "Nap.findByLName", query = "SELECT n FROM Nap n WHERE n.lName = :lName")
    , @NamedQuery(name = "Nap.findByFullName", query = "SELECT n FROM Nap n WHERE n.fullName = :fullName")
    , @NamedQuery(name = "Nap.findByAge", query = "SELECT n FROM Nap n WHERE n.age = :age")
    , @NamedQuery(name = "Nap.findByDob", query = "SELECT n FROM Nap n WHERE n.dob = :dob")
    , @NamedQuery(name = "Nap.findByGender", query = "SELECT n FROM Nap n WHERE n.gender = :gender")
    , @NamedQuery(name = "Nap.findByTp", query = "SELECT n FROM Nap n WHERE n.tp = :tp")
    , @NamedQuery(name = "Nap.findByAddress", query = "SELECT n FROM Nap n WHERE n.address = :address")
    , @NamedQuery(name = "Nap.findByMarage", query = "SELECT n FROM Nap n WHERE n.marage = :marage")
    , @NamedQuery(name = "Nap.findByAcNo", query = "SELECT n FROM Nap n WHERE n.acNo = :acNo")
    , @NamedQuery(name = "Nap.findByBank", query = "SELECT n FROM Nap n WHERE n.bank = :bank")
    , @NamedQuery(name = "Nap.findByPost", query = "SELECT n FROM Nap n WHERE n.post = :post")
    , @NamedQuery(name = "Nap.findByNic", query = "SELECT n FROM Nap n WHERE n.nic = :nic")})
public class Nap implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "n_id")
    private String nId;
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
    @Column(name = "post")
    private String post;
    @Basic(optional = false)
    @Column(name = "nic")
    private String nic;

    public Nap() {
    }

    public Nap(String nId) {
        this.nId = nId;
    }

    public Nap(String nId, String fName, String lName, String fullName, int age, String dob, String gender, String tp, String address, String marage, String acNo, String bank, String post, String nic) {
        this.nId = nId;
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
        this.post = post;
        this.nic = nic;
    }

    public String getNId() {
        return nId;
    }

    public void setNId(String nId) {
        String oldNId = this.nId;
        this.nId = nId;
        changeSupport.firePropertyChange("NId", oldNId, nId);
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        String oldPost = this.post;
        this.post = post;
        changeSupport.firePropertyChange("post", oldPost, post);
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
        hash += (nId != null ? nId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nap)) {
            return false;
        }
        Nap other = (Nap) object;
        if ((this.nId == null && other.nId != null) || (this.nId != null && !this.nId.equals(other.nId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "school.management.system.Nap[ nId=" + nId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
