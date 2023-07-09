package org.recruitingapp.service;

import org.recruitingapp.entity.VolunteerForm;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface FormService {


    public VolunteerForm save(VolunteerForm volunteerForm);
    public VolunteerForm update(VolunteerForm volunteerForm);
    public List<VolunteerForm> getAllVolunteers();
    public VolunteerForm getAVolunteer(Integer id);
    public void deleteAVolunteer(Integer id);
}
