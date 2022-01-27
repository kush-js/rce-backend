package com.example.demo.repository;
import com.example.demo.model.Applicant;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantRepository extends CrudRepository<Applicant, String> {

}
    

