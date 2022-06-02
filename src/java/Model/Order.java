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
public class Order {
    private Long id;
    private Long productId;
    private Long cartId;
    private int quantity;
    private float totalPrice;
    private int status; // 1 - active 0 - remove
    public Order() {
    }

    public Order(Long id, Long productId, Long cartId, int quantity, float totalPrice) {
        this.id = id;
        this.productId = productId;
        this.cartId = cartId;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public Order(Long productId, Long cartId, int quantity, float totalPrice) {
        this.productId = productId;
        this.cartId = cartId;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
    
}
