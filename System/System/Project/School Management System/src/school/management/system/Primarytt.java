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
@Table(name = "primarytt", catalog = "schoolmsdb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Primarytt.findAll", query = "SELECT p FROM Primarytt p")
    , @NamedQuery(name = "Primarytt.findBySId", query = "SELECT p FROM Primarytt p WHERE p.sId = :sId")
    , @NamedQuery(name = "Primarytt.findByYear", query = "SELECT p FROM Primarytt p WHERE p.year = :year")
    , @NamedQuery(name = "Primarytt.findBySemester", query = "SELECT p FROM Primarytt p WHERE p.semester = :semester")
    , @NamedQuery(name = "Primarytt.findByAvg", query = "SELECT p FROM Primarytt p WHERE p.avg = :avg")
    , @NamedQuery(name = "Primarytt.findByPlace", query = "SELECT p FROM Primarytt p WHERE p.place = :place")
    , @NamedQuery(name = "Primarytt.findByMaths", query = "SELECT p FROM Primarytt p WHERE p.maths = :maths")
    , @NamedQuery(name = "Primarytt.findBySinhala", query = "SELECT p FROM Primarytt p WHERE p.sinhala = :sinhala")
    , @NamedQuery(name = "Primarytt.findByEnglish", query = "SELECT p FROM Primarytt p WHERE p.english = :english")
    , @NamedQuery(name = "Primarytt.findByEnviranment", query = "SELECT p FROM Primarytt p WHERE p.enviranment = :enviranment")})
public class Primarytt implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "s_id")
    private String sId;
    @Basic(optional = false)
    @Column(name = "year")
    private int year;
    @Basic(optional = false)
    @Column(name = "semester")
    private String semester;
    @Basic(optional = false)
    @Column(name = "avg")
    private float avg;
    @Basic(optional = false)
    @Column(name = "place")
    private int place;
    @Basic(optional = false)
    @Column(name = "maths")
    private int maths;
    @Basic(optional = false)
    @Column(name = "sinhala")
    private int sinhala;
    @Basic(optional = false)
    @Column(name = "english")
    private int english;
    @Basic(optional = false)
    @Column(name = "enviranment")
    private int enviranment;

    public Primarytt() {
    }

    public Primarytt(String sId) {
        this.sId = sId;
    }

    public Primarytt(String sId, int year, String semester, float avg, int place, int maths, int sinhala, int english, int enviranment) {
        this.sId = sId;
        this.year = year;
        this.semester = semester;
        this.avg = avg;
        this.place = place;
        this.maths = maths;
        this.sinhala = sinhala;
        this.english = english;
        this.enviranment = enviranment;
    }

    public String getSId() {
        return sId;
    }

    public void setSId(String sId) {
        String oldSId = this.sId;
        this.sId = sId;
        changeSupport.firePropertyChange("SId", oldSId, sId);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int oldYear = this.year;
        this.year = year;
        changeSupport.firePropertyChange("year", oldYear, year);
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        String oldSemester = this.semester;
        this.semester = semester;
        changeSupport.firePropertyChange("semester", oldSemester, semester);
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        float oldAvg = this.avg;
        this.avg = avg;
        changeSupport.firePropertyChange("avg", oldAvg, avg);
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        int oldPlace = this.place;
        this.place = place;
        changeSupport.firePropertyChange("place", oldPlace, place);
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        int oldMaths = this.maths;
        this.maths = maths;
        changeSupport.firePropertyChange("maths", oldMaths, maths);
    }

    public int getSinhala() {
        return sinhala;
    }

    public void setSinhala(int sinhala) {
        int oldSinhala = this.sinhala;
        this.sinhala = sinhala;
        changeSupport.firePropertyChange("sinhala", oldSinhala, sinhala);
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        int oldEnglish = this.english;
        this.english = english;
        changeSupport.firePropertyChange("english", oldEnglish, english);
    }

    public int getEnviranment() {
        return enviranment;
    }

    public void setEnviranment(int enviranment) {
        int oldEnviranment = this.enviranment;
        this.enviranment = enviranment;
        changeSupport.firePropertyChange("enviranment", oldEnviranment, enviranment);
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
        if (!(object instanceof Primarytt)) {
            return false;
        }
        Primarytt other = (Primarytt) object;
        if ((this.sId == null && other.sId != null) || (this.sId != null && !this.sId.equals(other.sId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "school.management.system.Primarytt[ sId=" + sId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
