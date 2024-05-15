package dev.awd.behavioral.iterator;

import java.util.List;

public class EmployeeHierarchyCollection implements IterableCollection {
    private List<Employee> employees;
    private String employeeId;

    public EmployeeHierarchyCollection(String employeeId) {
        this.employees = List.of(
                new Employee("1", "Ali"),
                new Employee("2", "Mohamed"),
                new Employee("3", "Khalid"),
                new Employee("4", "Noha")
        );
        this.employeeId = employeeId;
    }


    public List<Employee> getEmployees() {
        return employees;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    @Override
    public EmployeeHierarchyIterator createEmployeeDirectReportIterator() {
        return new EmployeeDirectReportIterator(this);
    }

    @Override
    public EmployeeHierarchyIterator createEmployeeCoWorkerIterator() {
        return new EmployeeCoWorkerIterator(this);
    }

    @Override
    public EmployeeHierarchyIterator createEmployeeSubOrdinateIterator() {
        return new EmployeeSubOrdinateIterator(this);
    }
}
