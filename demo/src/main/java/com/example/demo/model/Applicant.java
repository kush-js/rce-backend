package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "APPLICANTS")
public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String firstname;
    private String lastname;

    public Applicant() {
    }

    public Applicant(String id, String firstname, String lastname) {

        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstname;
    }

    public void setFirstnameName(String name) {
        this.firstname = name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String name) {
        this.lastname = name;
    }

}
