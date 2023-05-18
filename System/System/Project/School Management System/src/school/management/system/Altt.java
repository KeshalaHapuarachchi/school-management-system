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
@Table(name = "altt", catalog = "schoolmsdb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Altt.findAll", query = "SELECT a FROM Altt a")
    , @NamedQuery(name = "Altt.findBySId", query = "SELECT a FROM Altt a WHERE a.sId = :sId")
    , @NamedQuery(name = "Altt.findByYear", query = "SELECT a FROM Altt a WHERE a.year = :year")
    , @NamedQuery(name = "Altt.findBySemester", query = "SELECT a FROM Altt a WHERE a.semester = :semester")
    , @NamedQuery(name = "Altt.findByAvg", query = "SELECT a FROM Altt a WHERE a.avg = :avg")
    , @NamedQuery(name = "Altt.findByPlace", query = "SELECT a FROM Altt a WHERE a.place = :place")
    , @NamedQuery(name = "Altt.findBySubI", query = "SELECT a FROM Altt a WHERE a.subI = :subI")
    , @NamedQuery(name = "Altt.findBySubIi", query = "SELECT a FROM Altt a WHERE a.subIi = :subIi")
    , @NamedQuery(name = "Altt.findBySubIii", query = "SELECT a FROM Altt a WHERE a.subIii = :subIii")
    , @NamedQuery(name = "Altt.findByEnglish", query = "SELECT a FROM Altt a WHERE a.english = :english")})
public class Altt implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "s_id")
    private String sId;
    @Basic(optional = false)
    @Column(name = "year")
    private int year;
    @Id
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
    @Column(name = "sub_i")
    private int subI;
    @Basic(optional = false)
    @Column(name = "sub_ii")
    private int subIi;
    @Basic(optional = false)
    @Column(name = "sub_iii")
    private int subIii;
    @Basic(optional = false)
    @Column(name = "english")
    private int english;

    public Altt() {
    }

    public Altt(String semester) {
        this.semester = semester;
    }

    public Altt(String semester, String sId, int year, float avg, int place, int subI, int subIi, int subIii, int english) {
        this.semester = semester;
        this.sId = sId;
        this.year = year;
        this.avg = avg;
        this.place = place;
        this.subI = subI;
        this.subIi = subIi;
        this.subIii = subIii;
        this.english = english;
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

    public int getSubI() {
        return subI;
    }

    public void setSubI(int subI) {
        int oldSubI = this.subI;
        this.subI = subI;
        changeSupport.firePropertyChange("subI", oldSubI, subI);
    }

    public int getSubIi() {
        return subIi;
    }

    public void setSubIi(int subIi) {
        int oldSubIi = this.subIi;
        this.subIi = subIi;
        changeSupport.firePropertyChange("subIi", oldSubIi, subIi);
    }

    public int getSubIii() {
        return subIii;
    }

    public void setSubIii(int subIii) {
        int oldSubIii = this.subIii;
        this.subIii = subIii;
        changeSupport.firePropertyChange("subIii", oldSubIii, subIii);
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        int oldEnglish = this.english;
        this.english = english;
        changeSupport.firePropertyChange("english", oldEnglish, english);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (semester != null ? semester.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Altt)) {
            return false;
        }
        Altt other = (Altt) object;
        if ((this.semester == null && other.semester != null) || (this.semester != null && !this.semester.equals(other.semester))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "school.management.system.Altt[ semester=" + semester + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
