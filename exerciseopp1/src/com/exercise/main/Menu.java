package com.exercise.main;

import com.exercise.employee.Employee;
import com.exercise.status.Status;

public class Menu {
    public static void main(String[] args) {
       
        Employee employee1 = new Employee("John Doe", 30, 1.75, "12345", 5000.0);
        Employee employee2 = new Employee("Jane Smith", 28, 1.65, "67890", 4500.0);

     
        System.out.println("Initial Information:");
        System.out.println(employee1);
        System.out.println(employee2);

       
        employee1.increaseSalary(10);
        System.out.println("\n After Salary Increase:");
        System.out.println(employee1);

  
        employee1.setStatus(Status.Approved);
        System.out.println("\n After Status Change:");
        System.out.println(employee1);
    }
}