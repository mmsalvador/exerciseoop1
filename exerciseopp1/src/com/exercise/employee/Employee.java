package com.exercise.employee;

import com.exercise.person.Person;
import com.exercise.status.Status;

public class Employee extends Person {
    private String registration;
    private double salary;
    private Status status;

    public Employee(String name, int age, double height, String registration, double salary) {
        super(name, age, height); 
        this.registration = registration;
        this.salary = salary;
        this.status = Status.Pending; 
    }

    // Getters e Setters
    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            this.salary += this.salary * (percentage / 100);
        } else {
            System.out.println("The percentage must be a positive value.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + 
               ", Employee{registration= '" + registration + "', salary= " + salary + ", status= " + status + "}";
    }
}