package dev.awd;

import dev.awd.iterator.EmployeeHierarchyCollection;
import dev.awd.iterator.EmployeeHierarchyIterator;

public class Main {
    public static void main(String[] args) {


        EmployeeHierarchyCollection collection = new EmployeeHierarchyCollection("1");
        EmployeeHierarchyIterator iterator = collection.createEmployeeDirectReportIterator();
        while (iterator.hasNext()) {

            System.out.println(iterator.getNext().getName());
        }

    }
}