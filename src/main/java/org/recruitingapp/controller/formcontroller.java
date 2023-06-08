package org.recruitingapp.controller;

import org.recruitingapp.service.formservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.recruitingapp.model.VolunteerForm;

@CrossOrigin
@RestController
public class formcontroller {

    @Autowired
    private formservice FormService;

    @PostMapping
    public boolean submitNewForm(@RequestBody VolunteerForm volunteerForm){
        return FormService.newFormService(volunteerForm);
    }

    @DeleteMapping
    public boolean deleteForm(@RequestBody String name){
        return true;
    }

}
