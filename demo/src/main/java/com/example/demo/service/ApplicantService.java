package com.example.demo.service;

import com.example.demo.model.Applicant;
import com.example.demo.repository.ApplicantRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ApplicantService implements IApplicantService {
    @Autowired
    private ApplicantRepository repository;

    @Override
    public List<Applicant> findAll() {

        var applicants = (List<Applicant>) repository.findAll();

        return applicants;
    }
}
