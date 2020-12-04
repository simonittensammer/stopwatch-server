package at.htl.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.LinkedList;

@Entity
public class TimeStop extends PanacheEntity {

    @Id
    @GeneratedValue()
    Long id;

    private String type;
    private LinkedList<Double> times = new LinkedList<>();

    public TimeStop() {
    }

    public TimeStop(String type, LinkedList<Double> times) {
        this.type = type;
        this.times = times;
    }

    public Long getId() {
        return id;
    }

//    public void setId(Long tsId) {
//        this.id = tsId;
//    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LinkedList<Double> getTimes() {
        return times;
    }

    public void setTimes(LinkedList<Double> times) {
        this.times = times;
    }
}
