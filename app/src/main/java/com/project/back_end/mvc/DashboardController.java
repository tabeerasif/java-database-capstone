package com.project.back_end.mvc;

import java.security.Provider.Service;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DashboardController {

    @Autowired
    Service service;

    @GetMapping("/adminDashboard/{token}")
    public String adminDashboard(@PathVariable String token) {
        Map<String, String> map = service.validateToken(token, "admin").getBody();
        if(map.isEmpty())
        {
            return "admin/adminDashboard";
        }
        return "redirect:http://localhost:8080"; 
    }

    @GetMapping("/doctorDashboard/{token}")
    public String doctorDashboard(@PathVariable String token)
    {
        Map<String, String> map=service.validateToken(token,"doctor").getBody();
        System.out.println("map"+map);
        if(map.isEmpty())
        {
            return "doctor/doctorDashboard";
        }
        
        return "redirect:http://localhost:8080"; 
        
    }

       



// 3. Define the `adminDashboard` Method:

//    - Accepts an admin's token as a path variable.
//    - Validates the token using the shared service for the `"admin"` role.
//    - If the token is valid (i.e., no errors returned), forwards the user to the `"admin/adminDashboard"` view.
//    - If invalid, redirects to the root URL, likely the login or home page.


// 4. Define the `doctorDashboard` Method:
//    - Handles HTTP GET requests to `/doctorDashboard/{token}`.
//    - Accepts a doctor's token as a path variable.
//    - Validates the token using the shared service for the `"doctor"` role.
//    - If the token is valid, forwards the user to the `"doctor/doctorDashboard"` view.
//    - If the token is invalid, redirects to the root URL.


}
