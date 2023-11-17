package com.developer.employeemanagement.dto.response;

import java.io.Serializable;
import java.util.Date;

public class EmployeeResponse implements Serializable {
    private Long id;
    private  String prenom;
    private String prenomar;
    private String nom;
    private String nomar;
    private String cin;
    private String attribut;
    private  Number phone;
    private  String email;

    public EmployeeResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenomar() {
        return prenomar;
    }

    public void setPrenomar(String prenomar) {
        this.prenomar = prenomar;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomar() {
        return nomar;
    }

    public void setNomar(String nomar) {
        this.nomar = nomar;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getAttribut() {
        return attribut;
    }

    public void setAttribut(String attribut) {
        this.attribut = attribut;
    }

    public Number getPhone() {
        return phone;
    }

    public void setPhone(Number phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
