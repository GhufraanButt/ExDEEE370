import java.util.ArrayList;

public class EmployeeManagementSystem {
    private ArrayList<Employee> employees;

    // Constructor
    public EmployeeManagementSystem() {
        this.employees = new ArrayList<>();
    }

    // Method to add an employee
    public boolean addEmployee(Employee employee) {
        if (employeeExists(employee.getId())) {
            return false; // Employee with this ID already exists
        }
        employees.add(employee);
        return true;
    }

    // Overloaded method to add an employee without address
    public boolean addEmployee(int id, String name, String designation, double salary, String email) {
        if (employeeExists(id)) {
            return false; // Employee with this ID already exists
        }
        Employee employee = Employee.createEmployee(id, name, designation, salary, email);
        employees.add(employee);
        return true;
    }

    // Method to check if an employee with a given ID already exists
    private boolean employeeExists(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return true;
            }
        }
        return false;
    }

    // Method to delete an employee by ID
    public void deleteEmployee(int id) {
        employees.removeIf(emp -> emp.getId() == id);
    }

    // Method to update an employee's details
    public void updateEmployee(int id, String name, String designation, double salary) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                emp.setName(name);
                emp.setDesignation(designation);
                emp.setSalary(salary);
                break;
            }
        }
    }

    // Method to get all employees
    public ArrayList<Employee> getAllEmployees() {
        return employees;
    }
}

gg

