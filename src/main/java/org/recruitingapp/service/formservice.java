package org.recruitingapp.service;

import org.recruitingapp.model.VolunteerForm;
import org.recruitingapp.dao.formrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class formservice {

    @Autowired
    private formrepository FormRepository;

    public boolean newFormService(VolunteerForm volunteerForm){
        return true;
    }
    public List<VolunteerForm> getAllVolunteers(){
        return null;
    }

    public VolunteerForm getAVolunteer(){
        return null;
    }
}
