package com.developer.employeemanagement.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "donateur")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long id;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "prenomar")
    private String prenomar;

    @Column(name = "nom")
    private String nom;

    @Column(name = "nomar")
    private String nomar;

    @Column(name = "cin")
    private String cin;

    @Column(name = "attribut")
    private String attribut;

    @Column(name = "phone")
    private Number phone;

    @Column(name = "email")
    private String email;

    @Column(name = "profile_picture_url")
    private String profilePictureUrl;

    @Column(name = "profile_picture")
    private byte[] profilePicture;

    public EmployeeEntity() {

    }

    public EmployeeEntity(Long id, String prenom, String prenomar, String nom, String nomar, String cin, String attribut, Number phone, String email, String profilePictureUrl, byte[] profilePicture) {
        this.id = id;
        this.prenom = prenom;
        this.prenomar = prenomar;
        this.nom = nom;
        this.nomar = nomar;
        this.cin = cin;
        this.attribut = attribut;
        this.phone = phone;
        this.email = email;
        this.profilePictureUrl = profilePictureUrl;
        this.profilePicture = profilePicture;
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

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }

    public byte[] getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(byte[] profilePicture) {
        this.profilePicture = profilePicture;
    }
}











