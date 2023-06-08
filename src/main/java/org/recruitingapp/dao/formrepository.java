package org.recruitingapp.dao;

import org.recruitingapp.model.VolunteerForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface formrepository extends JpaRepository<VolunteerForm, Integer> {

//    public boolean newFormService(VolunteerForm volunteerForm){
//        return true;
//    }

}
