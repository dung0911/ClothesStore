package com.shoesstore.shoesstore.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(name = "Categories.findParentCategories", query = "SELECT c FROM Categories c WHERE c.parent IS NULL"),
        @NamedQuery(name = "Categories.findChildCategories", query = "SELECT c FROM Categories c WHERE c.parent.id = :parentId")
})
public class Categories {
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
    @Column(name = "summary", nullable = true, length = -1)
    private String summary;
    @Basic
    @Column(name = "photo", nullable = true, length = 191)
    private String photo;
    @Basic
    @Column(name = "is_parent", nullable = false)
    private byte isParent;
//    @Basic
//    @Column(name = "parent_id", nullable = true)
//    private Object parentId;

    @ManyToOne
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    private Categories parent;

    @OneToMany(mappedBy = "parent")
    private List<Categories> children;

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

    public Categories getParent() {
        return parent;
    }

    public void setParent(Categories parent) {
        this.parent = parent;
    }

    public List<Categories> getChildren() {
        return children;
    }

    public void setChildren(List<Categories> children) {
        this.children = children;
    }

    public Categories() {
    }

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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public byte getIsParent() {
        return isParent;
    }

    public void setIsParent(byte isParent) {
        this.isParent = isParent;
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
