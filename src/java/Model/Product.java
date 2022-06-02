/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author window
 */
public class Product {

    private Long id;
    private String name;
    private String description;
    private String color;
    private String size;
    private int unitInStock;
    private int unitPrice;
    private String image;
    private Long userId;
    private Long categoryId;
    private int rating;
    private int status; // 1 - active 0 - remove

    public Product(Long id, String name, String description, String color, String size, int unitInStock, int unitPrice, String image, Long userId, Long categoryId, int status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.color = color;
        this.size = size;
        this.unitInStock = unitInStock;
        this.unitPrice = unitPrice;
        this.image = image;
        this.userId = userId;
        this.categoryId = categoryId;
        this.status = status;
    }

    public Product( String name, String description, String color, String size, int unitInStock, int unitPrice, String image, Long userId, Long categoryId) {
       
        this.name = name;
        this.description = description;
        this.color = color;
        this.size = size;
        this.unitInStock = unitInStock;
        this.unitPrice = unitPrice;
        this.image = image;
        this.userId = userId;
        this.categoryId = categoryId;
       
    }

    public Product(Long id, String name, String description, String color, String size, int unitInStock, int unitPrice, String image, Long userId, Long categoryId, int rating, int status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.color = color;
        this.size = size;
        this.unitInStock = unitInStock;
        this.unitPrice = unitPrice;
        this.image = image;
        this.userId = userId;
        this.categoryId = categoryId;
        this.rating = rating;
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Product() {
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
