package dev.awd.behavioral.visitor;

public class NightShiftScheduleManagement implements ScheduleManagement {
    @Override
    public void generateReport() {
        System.out.println("Generating Night Shift Report");

    }

    @Override
    public void calculateOverTime() {
        System.out.println("Calculating Night Shift OverTime");

    }

    @Override
    public void accept(ScheduleManagementVisitor scheduleManagementVisitor) {
        scheduleManagementVisitor.visit(this);
    }
}
