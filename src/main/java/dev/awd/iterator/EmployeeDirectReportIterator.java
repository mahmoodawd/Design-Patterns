package dev.awd.iterator;

public class EmployeeDirectReportIterator implements EmployeeHierarchyIterator {
    private final EmployeeHierarchyCollection employeeHierarchyCollection;
    private int currentDirectReportPosition;


    public EmployeeDirectReportIterator(EmployeeHierarchyCollection employeeHierarchyCollection) {
        this.employeeHierarchyCollection = employeeHierarchyCollection;
    }

    @Override
    public Employee getNext() {
        System.out.println("Getting Direct Report");
        if (!hasNext()) {
            return null;
        } else {
            return employeeHierarchyCollection.getEmployees().get(currentDirectReportPosition++);
        }
    }

    @Override
    public boolean hasNext() {
        return currentDirectReportPosition < employeeHierarchyCollection.getEmployees().size();
    }
}
