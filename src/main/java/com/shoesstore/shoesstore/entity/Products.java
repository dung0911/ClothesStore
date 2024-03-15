package com.shoesstore.shoesstore.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@NamedQueries({
        @NamedQuery(name = "Products.findAllPro", query = "SELECT o FROM Products o"),
        @NamedQuery(name = "Products.findAllProAsc", query = "SELECT o FROM Products o order by o.title asc"),
        @NamedQuery(name = "Products.findAllProDesc", query = "SELECT o FROM Products o order by o.title desc"),
        @NamedQuery(name = "Products.findByProductName", query = "SELECT o FROM Products o WHERE o.title IS NULL OR o.title LIKE CONCAT('%', :productName, '%')")
})
public class Products {
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
    @Column(name = "photo", nullable = false, length = -1)
    private String photo;
    @Basic
    @Column(name = "stock", nullable = false)
    private int stock;
    @Basic
    @Column(name = "size", nullable = true, length = 191)
    private String size;
    @Basic
    @Column(name = "condition", nullable = false)
    private Object condition;
    @Basic
    @Column(name = "status", nullable = false)
    private Object status;
    @Basic
    @Column(name = "price", nullable = false, precision = 2)
    private double price;
    @Basic
    @Column(name = "discount", nullable = false, precision = 2)
    private double discount;
    @Basic
    @Column(name = "is_featured", nullable = false)
    private byte isFeatured;
    @Basic
    @Column(name = "cat_id", nullable = true)
    private Object catId;
    @Basic
    @Column(name = "child_cat_id", nullable = true)
    private Object childCatId;
    @Basic
    @Column(name = "brand_id", nullable = true)
    private Object brandId;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Object getCondition() {
        return condition;
    }

    public void setCondition(Object condition) {
        this.condition = condition;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public byte getIsFeatured() {
        return isFeatured;
    }

    public void setIsFeatured(byte isFeatured) {
        this.isFeatured = isFeatured;
    }

    public Object getCatId() {
        return catId;
    }

    public void setCatId(Object catId) {
        this.catId = catId;
    }

    public Object getChildCatId() {
        return childCatId;
    }

    public void setChildCatId(Object childCatId) {
        this.childCatId = childCatId;
    }

    public Object getBrandId() {
        return brandId;
    }

    public void setBrandId(Object brandId) {
        this.brandId = brandId;
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
