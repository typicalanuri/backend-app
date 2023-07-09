package org.recruitingapp.serviceimpl;

import jakarta.transaction.Transactional;
import org.recruitingapp.entity.VolunteerForm;
import org.recruitingapp.repository.formrepository;
import org.recruitingapp.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormServiceImpl implements FormService {
    @Autowired
    private formrepository repository;

    @Transactional
    public VolunteerForm save(VolunteerForm volunteerForm){
        return repository.save(volunteerForm);
    }
    public VolunteerForm update(VolunteerForm volunteerForm){
        return repository.save(volunteerForm);
    }
    @Transactional
    public List<VolunteerForm> getAllVolunteers(){
        return repository.findAll();
    }
    @Transactional
    public VolunteerForm getAVolunteer(Integer id){
        Optional<VolunteerForm> volunteerFormResponse = repository.findById(id);
       return volunteerFormResponse.get();
    }
    @Transactional
    public void deleteAVolunteer(Integer id){
            repository.deleteById(id);
    }
}
