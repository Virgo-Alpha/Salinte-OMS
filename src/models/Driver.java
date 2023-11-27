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

public class Driver {
    private int employeeId;
    private WareHouse warehouse;
    private List<String> schedule;
    private List<String> routeSchedule;
    private List<String> orderIdList;
    private String vehicleId;

    // Constructor
    public Driver(int employeeId, WareHouse warehouse, String vehicleId) {
        this.employeeId = employeeId;
        this.warehouse = warehouse;
        this.vehicleId = vehicleId;
        this.schedule = new ArrayList<>();
        this.routeSchedule = new ArrayList<>();
        this.orderIdList = new ArrayList<>();
    }

    // Operations
    public void deliverOrder(String orderId, String warehouseId) {
        // Logic to deliver the order
        System.out.println("Delivering order " + orderId + " to warehouse " + warehouseId);
    }

    public void updateRouteSchedule(List<String> newSchedule) {
        this.routeSchedule = newSchedule;
        // Additional logic for updating route schedule
        System.out.println("Route schedule updated");
    }

    // Getters and setters (omitted for brevity)

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public WareHouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(WareHouse warehouse) {
        this.warehouse = warehouse;
    }

    public List<String> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<String> schedule) {
        this.schedule = schedule;
    }

    public List<String> getRouteSchedule() {
        return routeSchedule;
    }

    public void setRouteSchedule(List<String> routeSchedule) {
        this.routeSchedule = routeSchedule;
    }

    public List<String> getOrderIdList() {
        return orderIdList;
    }

    public void setOrderIdList(List<String> orderIdList) {
        this.orderIdList = orderIdList;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    
}
