package org.recruitingapp.controller;

import org.recruitingapp.model.VolunteerForm;
import org.recruitingapp.service.formservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class dashboardcontroller {

    @Autowired
    private formservice FormService;

    @GetMapping
    public List<VolunteerForm> getAllVolunteers(){
        return FormService.getAllVolunteers();
    }

    @GetMapping
    public VolunteerForm getAVolunteer(){
        return FormService.getAVolunteer();
    }

}
