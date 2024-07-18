package dev.awd.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Department implements OrganizationUnit {
    private List<OrganizationUnit> units;


    public Department() {
        units = new ArrayList<>();
    }

    public void addOrganizationUnit(OrganizationUnit unit) {
        units.add(unit);
    }

    @Override
    public double calculateTotalSalary() {
        return units.stream().mapToDouble(OrganizationUnit::calculateTotalSalary).sum();
    }
}
