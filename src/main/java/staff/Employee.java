package staff;

import com.sun.istack.internal.NotNull;

//        Create an abstract Employee parent class in a package called staff.
public abstract class Employee {

    // Employee will have a name, NI number and salary.

    private String name;
    private String nINumber;
    private double salary;

    public Employee(String name, String nINumber, double salary) {
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    // Create Getters for all properties.

    public String getName() {
        return name;
    }

    public String getnINumber() {
        return nINumber;
    }

    public double getSalary() {
        return salary;
    }

    // Add a method named raiseSalary with takes in a parameter of type double to increment the salary.
    // Prevent a negative value for the raiseSalary method.

    public void raiseSalary(double amount) {
        if (amount > 0)
            this.salary = salary + amount;
    }

    // Add a method called payBonus which returns 1% of the employees salary.

    public double payBonus() {
        return salary / 100;
    }

    // Allow the user to change the Employees name and prevent a null value from being entered.
    public void setName(String name) {
        if (name == null)
            name = this.name;
        else {
            this.name = name;
        }
    }

}