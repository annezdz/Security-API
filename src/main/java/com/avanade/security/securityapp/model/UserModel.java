package com.avanade.security.securityapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "public.USERS")
public class UserModel {

    @Id
    @Column(length = 30, nullable = false)
    private String username;

    @Column(length = 15, nullable = false)
    private String password;

    @Column(length = 30, nullable = false)
    private String firstname;

    @Column(length = 30, nullable = false)
    private String lastname;

    @Column(length = 30)
    private String email;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
