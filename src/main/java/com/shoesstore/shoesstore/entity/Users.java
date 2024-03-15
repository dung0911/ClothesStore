package com.shoesstore.shoesstore.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@NamedQueries({
        @NamedQuery(name = "Users.findByUsernameAndPassword", query = "SELECT u FROM Users u WHERE u.username = :username AND u.password = :password")
})
public class Users {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "name", length = 191)
    private String name;
    @Column(name = "username", length = 191)
    private String username;
    @Basic
    @Column(name = "email", nullable = true, length = 191)
    private String email;
    @Basic
    @Column(name = "email_verified_at", nullable = true)
    private Timestamp emailVerifiedAt;
    @Basic
    @Column(name = "password", nullable = true, length = 191)
    private String password;
    @Basic
    @Column(name = "photo", nullable = true, length = 191)
    private String photo;
    @Basic
    @Column(name = "role")
    private int role;
    @Basic
    @Column(name = "provider", nullable = true, length = 191)
    private String provider;
    @Basic
    @Column(name = "provider_id", nullable = true, length = 191)
    private String providerId;
    @Basic
    @Column(name = "status")
    private int status = 1;
    @Basic
    @Column(name = "created_at", nullable = true)
    private Timestamp createdAt;
    @Basic
    @Column(name = "updated_at", nullable = true)
    private Timestamp updatedAt;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getEmailVerifiedAt() {
        return emailVerifiedAt;
    }

    public void setEmailVerifiedAt(Timestamp emailVerifiedAt) {
        this.emailVerifiedAt = emailVerifiedAt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}
