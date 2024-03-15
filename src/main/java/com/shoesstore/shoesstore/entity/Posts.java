package com.shoesstore.shoesstore.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Posts {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "title", nullable = false, length = 191)
    private String title;
    @Basic
    @Column(name = "slug", nullable = false, length = 191)
    private String slug;
    @Basic
    @Column(name = "summary", nullable = false, length = -1)
    private String summary;
    @Basic
    @Column(name = "description", nullable = true, length = -1)
    private String description;
    @Basic
    @Column(name = "quote", nullable = true, length = -1)
    private String quote;
    @Basic
    @Column(name = "photo", nullable = true, length = 191)
    private String photo;
    @Basic
    @Column(name = "tags", nullable = true, length = 191)
    private String tags;
    @Basic
    @Column(name = "post_cat_id", nullable = true)
    private Object postCatId;
    @Basic
    @Column(name = "post_tag_id", nullable = true)
    private Object postTagId;
    @Basic
    @Column(name = "added_by", nullable = true)
    private Object addedBy;
    @Basic
    @Column(name = "status", nullable = false)
    private Object status;
    @Basic
    @Column(name = "created_at", nullable = true)
    private Timestamp createdAt;
    @Basic
    @Column(name = "updated_at", nullable = true)
    private Timestamp updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Object getPostCatId() {
        return postCatId;
    }

    public void setPostCatId(Object postCatId) {
        this.postCatId = postCatId;
    }

    public Object getPostTagId() {
        return postTagId;
    }

    public void setPostTagId(Object postTagId) {
        this.postTagId = postTagId;
    }

    public Object getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(Object addedBy) {
        this.addedBy = addedBy;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
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
