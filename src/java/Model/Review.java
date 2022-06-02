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
public class Review {
    private Long id;
    private String comment;
    private int rating;
    private Long productId;
    private Long userId;

    public Review() {
    }

    public Review(Long id, String comment, int rating, Long productId, Long userId) {
        this.id = id;
        this.comment = comment;
        this.rating = rating;
        this.productId = productId;
        this.userId = userId;
    }

    public Review(String comment, int rating, Long productId, Long userId) {
        this.comment = comment;
        this.rating = rating;
        this.productId = productId;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    
}
