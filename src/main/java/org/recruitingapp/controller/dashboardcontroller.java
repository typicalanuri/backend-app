package org.recruitingapp.controller;

import org.recruitingapp.entity.VolunteerForm;
import org.recruitingapp.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dashboard")
public class dashboardcontroller {

    @Autowired
    private FormService FormService;

    @GetMapping("/home")
    public String getHome(){
        return "Home";
    }

    @GetMapping("/getall")
    public List<VolunteerForm> getAllVolunteers(){
        return FormService.getAllVolunteers();
    }

    @GetMapping("/get")
    public VolunteerForm getAVolunteer(Integer id){
        return FormService.getAVolunteer(id);
    }
}
