/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;
import models.Employee;

/**
 *
 * @author User
 */
import java.util.HashMap;
import java.util.Map;

public class EmployeeRepository {
    private Map<String, Employee> employeeList; // Assuming String is used as the key (Employee ID)

    public EmployeeRepository() {
        employeeList = new HashMap<>();
    }

    // Add an employee to the repository
    public void addEmployee(String employeeId, Employee employee) {
        employeeList.put(employeeId, employee);
    }

    // Retrieve employee details based on employeeId
    public Employee getEmployee(String employeeId) {
        return employeeList.get(employeeId);
    }

    // Update employee details in the repository
    public void updateEmployee(String employeeId, Employee updatedEmployee) {
        if (employeeList.containsKey(employeeId)) {
            employeeList.put(employeeId, updatedEmployee);
            System.out.println("Employee details updated for ID " + employeeId);
        } else {
            System.out.println("Employee ID " + employeeId + " not found");
        }
    }
}

