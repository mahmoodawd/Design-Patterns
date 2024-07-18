package dev.awd;


import dev.awd.structural.composite.Department;
import dev.awd.structural.composite.Employee;

public class Main {
    public static void main(String[] args) {
        Employee ali = new Employee("Ali", 1000.0);
        Employee mohamed = new Employee("Mohamed", 2000.0);
        Employee khalid = new Employee("Khalid", 10000.0);

        Department department = new Department();
        department.addOrganizationUnit(ali);
        department.addOrganizationUnit(mohamed);

        Department subDepartment = new Department();
        subDepartment.addOrganizationUnit(khalid);

        department.addOrganizationUnit(subDepartment);

        System.out.println(subDepartment.calculateTotalSalary());
        System.out.println(department.calculateTotalSalary());
    }
}