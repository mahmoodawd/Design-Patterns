package dev.awd.behavioral.visitor;

public class DayShiftScheduleManagement implements ScheduleManagement {
    @Override
    public void generateReport() {
        System.out.println("Generating Day Shift Report");
    }

    @Override
    public void calculateOverTime() {
        System.out.println("Calculating Day Shift Over Time");
    }

    @Override
    public void accept(ScheduleManagementVisitor scheduleManagementVisitor) {
        scheduleManagementVisitor.visit(this);
    }
}
