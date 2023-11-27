/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.List;

public class CustomerRelationshipManager {
    private int customerId;
    private String phoneNumber;
    private String email;
    private List<Order> orderHistory;
    private List<Product> wishList;
    private Product favouriteProduct;

    // Constructor
    public CustomerRelationshipManager(int customerId, String phoneNumber, String email) {
        this.customerId = customerId;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.orderHistory = new ArrayList<>();
        this.wishList = new ArrayList<>();
        this.favouriteProduct = null;
    }

    // Operations
    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public double getTotalSpend() {
        double totalSpend = 0.0;
        for (Order order : orderHistory) {
            totalSpend += order.getOrderTotal(); // Assuming getOrderTotal method in Order class
        }
        return totalSpend;
    }

    public List<Product> getWishList() {
        return wishList;
    }

    public Product getFavouriteProduct() {
        return favouriteProduct;
    }

    // Other utility methods as needed
    // (Getters and Setters are omitted for brevity)

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}

