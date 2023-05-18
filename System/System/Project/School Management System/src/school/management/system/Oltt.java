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
@Table(name = "oltt", catalog = "schoolmsdb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Oltt.findAll", query = "SELECT o FROM Oltt o")
    , @NamedQuery(name = "Oltt.findBySId", query = "SELECT o FROM Oltt o WHERE o.sId = :sId")
    , @NamedQuery(name = "Oltt.findByYear", query = "SELECT o FROM Oltt o WHERE o.year = :year")
    , @NamedQuery(name = "Oltt.findBySemester", query = "SELECT o FROM Oltt o WHERE o.semester = :semester")
    , @NamedQuery(name = "Oltt.findByAvg", query = "SELECT o FROM Oltt o WHERE o.avg = :avg")
    , @NamedQuery(name = "Oltt.findByPlace", query = "SELECT o FROM Oltt o WHERE o.place = :place")
    , @NamedQuery(name = "Oltt.findByMaths", query = "SELECT o FROM Oltt o WHERE o.maths = :maths")
    , @NamedQuery(name = "Oltt.findByScience", query = "SELECT o FROM Oltt o WHERE o.science = :science")
    , @NamedQuery(name = "Oltt.findByEnglish", query = "SELECT o FROM Oltt o WHERE o.english = :english")
    , @NamedQuery(name = "Oltt.findBySinhala", query = "SELECT o FROM Oltt o WHERE o.sinhala = :sinhala")
    , @NamedQuery(name = "Oltt.findByReligon", query = "SELECT o FROM Oltt o WHERE o.religon = :religon")
    , @NamedQuery(name = "Oltt.findByHistory", query = "SELECT o FROM Oltt o WHERE o.history = :history")
    , @NamedQuery(name = "Oltt.findByGI", query = "SELECT o FROM Oltt o WHERE o.gI = :gI")
    , @NamedQuery(name = "Oltt.findByGIi", query = "SELECT o FROM Oltt o WHERE o.gIi = :gIi")
    , @NamedQuery(name = "Oltt.findByGIii", query = "SELECT o FROM Oltt o WHERE o.gIii = :gIii")})
public class Oltt implements Serializable {

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
    @Column(name = "maths")
    private int maths;
    @Basic(optional = false)
    @Column(name = "science")
    private int science;
    @Basic(optional = false)
    @Column(name = "english")
    private int english;
    @Basic(optional = false)
    @Column(name = "sinhala")
    private int sinhala;
    @Basic(optional = false)
    @Column(name = "religon")
    private int religon;
    @Basic(optional = false)
    @Column(name = "history")
    private int history;
    @Basic(optional = false)
    @Column(name = "g_i")
    private int gI;
    @Basic(optional = false)
    @Column(name = "g_ii")
    private int gIi;
    @Basic(optional = false)
    @Column(name = "g_iii")
    private int gIii;

    public Oltt() {
    }

    public Oltt(String semester) {
        this.semester = semester;
    }

    public Oltt(String semester, String sId, int year, float avg, int place, int maths, int science, int english, int sinhala, int religon, int history, int gI, int gIi, int gIii) {
        this.semester = semester;
        this.sId = sId;
        this.year = year;
        this.avg = avg;
        this.place = place;
        this.maths = maths;
        this.science = science;
        this.english = english;
        this.sinhala = sinhala;
        this.religon = religon;
        this.history = history;
        this.gI = gI;
        this.gIi = gIi;
        this.gIii = gIii;
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

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        int oldScience = this.science;
        this.science = science;
        changeSupport.firePropertyChange("science", oldScience, science);
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        int oldEnglish = this.english;
        this.english = english;
        changeSupport.firePropertyChange("english", oldEnglish, english);
    }

    public int getSinhala() {
        return sinhala;
    }

    public void setSinhala(int sinhala) {
        int oldSinhala = this.sinhala;
        this.sinhala = sinhala;
        changeSupport.firePropertyChange("sinhala", oldSinhala, sinhala);
    }

    public int getReligon() {
        return religon;
    }

    public void setReligon(int religon) {
        int oldReligon = this.religon;
        this.religon = religon;
        changeSupport.firePropertyChange("religon", oldReligon, religon);
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        int oldHistory = this.history;
        this.history = history;
        changeSupport.firePropertyChange("history", oldHistory, history);
    }

    public int getGI() {
        return gI;
    }

    public void setGI(int gI) {
        int oldGI = this.gI;
        this.gI = gI;
        changeSupport.firePropertyChange("GI", oldGI, gI);
    }

    public int getGIi() {
        return gIi;
    }

    public void setGIi(int gIi) {
        int oldGIi = this.gIi;
        this.gIi = gIi;
        changeSupport.firePropertyChange("GIi", oldGIi, gIi);
    }

    public int getGIii() {
        return gIii;
    }

    public void setGIii(int gIii) {
        int oldGIii = this.gIii;
        this.gIii = gIii;
        changeSupport.firePropertyChange("GIii", oldGIii, gIii);
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
        if (!(object instanceof Oltt)) {
            return false;
        }
        Oltt other = (Oltt) object;
        if ((this.semester == null && other.semester != null) || (this.semester != null && !this.semester.equals(other.semester))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "school.management.system.Oltt[ semester=" + semester + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
