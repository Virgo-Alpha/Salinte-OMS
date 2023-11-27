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

public class Customer {
    private int customerId;
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private String address;
    private List<Order> personalOrders;

    // Constructor
    public Customer(int customerId, String firstName, String lastName, String gender, int age, String address) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.personalOrders = new ArrayList<>();
    }

    // Operations
    public void placeOrder(Order order) {
        personalOrders.add(order);
        System.out.println("Order placed successfully!");
    }

    public void viewPersonalOrderHistory() {
        if (personalOrders.isEmpty()) {
            System.out.println("No order history available.");
        } else {
            System.out.println("Personal Order History:");
            for (Order order : personalOrders) {
                System.out.println(order.getOrderDetails());
            }
        }
    }

    public void receiveElectronicReceipt(Order order) {
        if (personalOrders.contains(order)) {
            String receipt = generateReceipt(order);
            System.out.println("Electronic receipt received:\n" + receipt);
        } else {
            System.out.println("No such order in history.");
        }
    }

    private String generateReceipt(Order order) {
        // Logic to generate a receipt based on the order details
        return "Receipt for Order ID: " + order.getOrderId() + "\nDetails: " + order.getOrderDetails();
    }

    // Getters and Setters

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Order> getPersonalOrders() {
        return personalOrders;
    }

    public void setPersonalOrders(List<Order> personalOrders) {
        this.personalOrders = personalOrders;
    }
    
    
}
