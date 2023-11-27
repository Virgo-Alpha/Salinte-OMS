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
public class SalesStaff {
    private int employeeId;
    private int salesTargets;
    private int salesPerformance;

    // Constructor
    public SalesStaff(int employeeId, int salesTargets, int salesPerformance) {
        this.employeeId = employeeId;
        this.salesTargets = salesTargets;
        this.salesPerformance = salesPerformance;
    }

    // Operations
    public void printOrders() {
        // Implementation for printing orders
        System.out.println("Orders printed successfully!");
    }

    public void manageDriverDeliveries() {
        // Implementation for managing driver deliveries
        System.out.println("Driver deliveries managed successfully!");
    }

    public void takeTelephoneOrders() {
        // Implementation for taking telephone orders
        System.out.println("Telephone orders taken successfully!");
    }

    public int calculateCommission() {
        // Implementation for calculating commission based on sales performance
        // Dummy implementation returning a random value
        return salesPerformance * 5; // Assuming some arbitrary formula for commission
    }

    public void handleCustomerQueries() {
        // Implementation for handling customer queries
        System.out.println("Customer queries handled successfully!");
    }

    // Getters and Setters

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getSalesTargets() {
        return salesTargets;
    }

    public void setSalesTargets(int salesTargets) {
        this.salesTargets = salesTargets;
    }

    public int getSalesPerformance() {
        return salesPerformance;
    }

    public void setSalesPerformance(int salesPerformance) {
        this.salesPerformance = salesPerformance;
    }
    
}

