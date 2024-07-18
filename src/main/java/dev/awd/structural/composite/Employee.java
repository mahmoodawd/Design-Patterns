package dev.awd.structural.composite;

public class Employee implements OrganizationUnit {
    private final String name;
    private final double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public double calculateTotalSalary() {
        return salary;
    }
}
