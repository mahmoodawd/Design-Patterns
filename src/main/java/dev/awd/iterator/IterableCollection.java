package dev.awd.iterator;

public interface IterableCollection {


    public EmployeeHierarchyIterator createEmployeeDirectReportIterator();

    public EmployeeHierarchyIterator createEmployeeCoWorkerIterator();

    public EmployeeHierarchyIterator createEmployeeSubOrdinateIterator();
}
