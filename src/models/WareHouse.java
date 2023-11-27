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

public class WareHouse {
    private int warehouseId;
    private String name;
    private String location;
    private List<Product> productList;
    private List<Integer> driverIdList;
    private int stock;

    // Constructor
    public WareHouse(int warehouseId, String name, String location) {
        this.warehouseId = warehouseId;
        this.name = name;
        this.location = location;
        this.productList = new ArrayList<>();
        this.driverIdList = new ArrayList<>();
        this.stock = 0; // Assuming initial stock is zero
    }

    // Operations
    public void processOrder() {
        // Implementation for processing orders
        System.out.println("Order processed successfully!");
    }

    public void manageInventory() {
        // Implementation for managing inventory
        System.out.println("Inventory managed successfully!");
    }

    // Getters and Setters
    

    // Other utility methods as needed

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Integer> getDriverIdList() {
        return driverIdList;
    }

    public void setDriverIdList(List<Integer> driverIdList) {
        this.driverIdList = driverIdList;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

