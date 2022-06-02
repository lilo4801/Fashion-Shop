/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author window
 */
public class Cart {

    private Long id;
    private Long userId;
    private float totalPriceOfProduct;
    private boolean checkPay;
    private String address;
    private String note;
    private String state; // pendding
    private Date fromOrder; // time order
    private Date toOrder; // predict order
   

    public Cart() {
    }

    public Cart(Long id, Long userId, float totalPriceOfProduct, boolean checkPay, String address, String note, String state, Date fromOrder, Date toOrdder) {
        this.id = id;
        this.userId = userId;
        this.totalPriceOfProduct = totalPriceOfProduct;
        this.checkPay = checkPay;
        this.address = address;
        this.note = note;
        this.state = state;
        this.fromOrder = fromOrder;
        this.toOrder = toOrdder;
    }

    public Date getFromOrder() {
        return fromOrder;
    }

    public void setFromOrder(Date fromOrder) {
        this.fromOrder = fromOrder;
    }

    public Date getToOrder() {
        return toOrder;
    }

    public void setToOrder(Date toOrder) {
        this.toOrder = toOrder;
    }

    
    
    
    public Cart(Long userId, float totalPriceOfProduct, boolean checkPay) {
        this.userId = userId;
        this.totalPriceOfProduct = totalPriceOfProduct;
        this.checkPay = checkPay;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public float getTotalPriceOfProduct() {
        return totalPriceOfProduct;
    }

    public void setTotalPriceOfProduct(float totalPriceOfProduct) {
        this.totalPriceOfProduct = totalPriceOfProduct;
    }

    public boolean isCheckPay() {
        return checkPay;
    }

    public void setCheckPay(boolean checkPay) {
        this.checkPay = checkPay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
