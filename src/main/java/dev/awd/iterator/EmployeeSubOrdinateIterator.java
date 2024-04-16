package dev.awd.iterator;

public class EmployeeSubOrdinateIterator implements EmployeeHierarchyIterator {
    private final EmployeeHierarchyCollection employeeHierarchyCollection;
    private int currentSubOrdinatePosition;


    public EmployeeSubOrdinateIterator(EmployeeHierarchyCollection employeeHierarchyCollection) {
        this.employeeHierarchyCollection = employeeHierarchyCollection;
    }

    @Override
    public Employee getNext() {
        System.out.println("Getting SubOrdinate");
        if (!hasNext()) {
            return null;
        } else {
            return employeeHierarchyCollection.getEmployees().get(currentSubOrdinatePosition++);
        }
    }

    @Override
    public boolean hasNext() {
        return currentSubOrdinatePosition < employeeHierarchyCollection.getEmployees().size();
    }
}
