package org.recruitingapp.model;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import javax.

import java.sql.Time;

@Getter
@Setter
public class VolunteerForm {

    @Id
    @Generatedvalue
    private Integer id;
    private String name;
    private String expertise;
    private String membership;
    private Time startDate;
    private Time endDate;

    public VolunteerForm() {
    }

    public VolunteerForm(Integer id, String name, String expertise, String membership, Time startDate, Time endDate) {
        this.id = id;
        this.name = name;
        this.expertise = expertise;
        this.membership = membership;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public Time getStartDate() {
        return startDate;
    }

    public void setStartDate(Time startDate) {
        this.startDate = startDate;
    }

    public Time getEndDate() {
        return endDate;
    }

    public void setEndDate(Time endDate) {
        this.endDate = endDate;
    }
}
