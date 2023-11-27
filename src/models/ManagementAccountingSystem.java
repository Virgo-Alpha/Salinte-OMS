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
public class ManagementAccountingSystem {
    private int productId;
    private double productBuyingPrice;
    private double productSellingPrice;
    private int warranty;
    
    // Constructor
    public ManagementAccountingSystem(int productId, double productBuyingPrice, double productSellingPrice, int warranty) {
        this.productId = productId;
        this.productBuyingPrice = productBuyingPrice;
        this.productSellingPrice = productSellingPrice;
        this.warranty = warranty;
    }
    
    // Getter and Setter methods
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getProductBuyingPrice() {
        return productBuyingPrice;
    }

    public void setProductBuyingPrice(double productBuyingPrice) {
        this.productBuyingPrice = productBuyingPrice;
    }

    public double getProductSellingPrice() {
        return productSellingPrice;
    }

    public void setProductSellingPrice(double productSellingPrice) {
        this.productSellingPrice = productSellingPrice;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    // Operations
    public double getProductProfit() {
        return productSellingPrice - productBuyingPrice;
    }
    
    public int getWarrantyPeriod() {
        return warranty;
    }
    
    // Additional methods related to ManagementAccounting
}

