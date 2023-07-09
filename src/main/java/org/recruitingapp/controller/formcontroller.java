package org.recruitingapp.controller;

import org.recruitingapp.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.recruitingapp.entity.VolunteerForm;

@CrossOrigin
@RestController
public class formcontroller {

    @Autowired
    private FormService formService;

    @PostMapping("/newform")
    public VolunteerForm submitNewForm(@RequestBody VolunteerForm volunteerForm){
        return formService.save(volunteerForm);
     }
     @GetMapping("/getform")
     public VolunteerForm getForm(@RequestBody Integer id){
        return formService.getAVolunteer(id);
     }
    @DeleteMapping("/deleteform")
    public void deleteForm(@RequestBody Integer id){
        formService.deleteAVolunteer(id);
    }

}
