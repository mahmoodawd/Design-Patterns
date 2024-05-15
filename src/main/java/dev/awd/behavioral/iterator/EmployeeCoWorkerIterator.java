package dev.awd.behavioral.iterator;

public class EmployeeCoWorkerIterator implements EmployeeHierarchyIterator {
    private final EmployeeHierarchyCollection employeeHierarchyCollection;
    private int currentCoWorkerPosition;


    public EmployeeCoWorkerIterator(EmployeeHierarchyCollection employeeHierarchyCollection) {
        this.employeeHierarchyCollection = employeeHierarchyCollection;
    }

    @Override
    public Employee getNext() {
        System.out.println("Getting CoWorker");
        if (!hasNext()) {
            return null;
        } else {
            return employeeHierarchyCollection.getEmployees().get(currentCoWorkerPosition++);
        }
    }

    @Override
    public boolean hasNext() {
        return currentCoWorkerPosition < employeeHierarchyCollection.getEmployees().size();
    }
}
