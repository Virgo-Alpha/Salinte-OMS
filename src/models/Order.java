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
import java.time.LocalDateTime;

public class Order {
    private int orderId;
    private LocalDateTime deliveryTime;
    private String deliveryLocation;
    private int customerId;
    private int assignedDriverId;
    private int warehouseId;
    private String orderStatus;

    // Constructor
    public Order(int orderId, LocalDateTime deliveryTime, String deliveryLocation,
                 int customerId, int assignedDriverId, int warehouseId, String orderStatus) {
        this.orderId = orderId;
        this.deliveryTime = deliveryTime;
        this.deliveryLocation = deliveryLocation;
        this.customerId = customerId;
        this.assignedDriverId = assignedDriverId;
        this.warehouseId = warehouseId;
        this.orderStatus = orderStatus;
    }

    // Operations
    public String generateReceipt() {
        return "Order Receipt for ID " + orderId + "\nDelivery Time: " + deliveryTime +
                "\nDelivery Location: " + deliveryLocation + "\nOrder Status: " + orderStatus;
    }

    public void manageDeliverySchedule(LocalDateTime newDeliveryTime, String newLocation) {
        this.deliveryTime = newDeliveryTime;
        this.deliveryLocation = newLocation;
        System.out.println("Delivery schedule updated successfully!");
    }

    public String getOrderStatus() {
        return "Order ID: " + orderId + "\nStatus: " + orderStatus;
    }

    public String getOrderDetails() {
        return "Order ID: " + orderId +
                "\nDelivery Time: " + deliveryTime +
                "\nDelivery Location: " + deliveryLocation +
                "\nCustomer ID: " + customerId +
                "\nAssigned Driver ID: " + assignedDriverId +
                "\nWarehouse ID: " + warehouseId +
                "\nOrder Status: " + orderStatus;
    }
    
    public double getOrderTotal() {
        double total = 0.0;
        // implement logic
        return total;
    }

    // Getters and Setters

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getAssignedDriverId() {
        return assignedDriverId;
    }

    public void setAssignedDriverId(int assignedDriverId) {
        this.assignedDriverId = assignedDriverId;
    }

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }
    
}

