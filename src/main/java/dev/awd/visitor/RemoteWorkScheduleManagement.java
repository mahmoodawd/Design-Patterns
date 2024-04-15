package dev.awd.visitor;

public class RemoteWorkScheduleManagement implements ScheduleManagement {
    @Override
    public void generateReport() {
        System.out.println("Generating Remote Work Report");

    }

    @Override
    public void calculateOverTime() {
        System.out.println("Calculating Remote Work Over Time");

    }

    @Override
    public void accept(ScheduleManagementVisitor scheduleManagementVisitor) {
        scheduleManagementVisitor.visit(this);
    }

}
