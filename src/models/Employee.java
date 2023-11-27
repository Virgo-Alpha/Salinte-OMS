/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Benson Mugure
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private String address;
    private String departmentId;

    // Constructor
    public Employee(String firstName, String lastName, String gender, int age, String address, String departmentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.departmentId = departmentId;
    }

    // Getters and Setters
    // ...

    // Operations
    public void getEmployeeDetails(String employeeId) {
        // Logic to fetch employee details from database using employeeId
        // Display or return the details
        System.out.println("Employee Details for ID " + employeeId + ":");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Department ID: " + departmentId);
    }

    public void updateEmployeeDetails(String employeeId) {
        // Logic to update employee details in the database using employeeId
        // Update the details
        // Display success message or handle update process
        System.out.println("Employee details updated for ID " + employeeId);
    }
}
