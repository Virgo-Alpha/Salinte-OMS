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
public class StockManagementSystem {
    private int SMSId;
    private int productId;
    private int productQuantity;
    private int warehouseId;
    private int supplierId;
    
    // Constructor
    public StockManagementSystem(int SMSId, int productId, int productQuantity, int warehouseId, int supplierId) {
        this.SMSId = SMSId;
        this.productId = productId;
        this.productQuantity = productQuantity;
        this.warehouseId = warehouseId;
        this.supplierId = supplierId;
    }
    
    // Getter and Setter methods
    public int getSMSId() {
        return SMSId;
    }

    public void setSMSId(int SMSId) {
        this.SMSId = SMSId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    // Other operations
    public int getSupplyContractId() {
        // Implementation to get supply contract ID
        return 0;
    }
    
    public void updateSupplierId(int newSupplierId) {
        this.supplierId = newSupplierId;
        // Additional implementation for updating supplier ID
    }
    
    // Additional methods and operations related to StockManagementSystem
    
}

