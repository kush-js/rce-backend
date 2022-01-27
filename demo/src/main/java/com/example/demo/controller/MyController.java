package com.example.demo.controller;

import com.example.demo.model.Applicant;
import com.example.demo.model.City;
import com.example.demo.service.IApplicantService;
import com.example.demo.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private ICityService cityService;

    @GetMapping("/showCities")
    public String findCities(Model model) {

        var cities = (List<City>) cityService.findAll();

        model.addAttribute("cities", cities);

        return "showCities";
    }

    @Autowired
    private IApplicantService applicantService;

    @GetMapping("/showApplicants")
    public String findApplicants(Model model) {

        var applicants = (List<Applicant>) applicantService.findAll();

        model.addAttribute("APPLICANTS", applicants);

        return "showApplicants";
    }
};
