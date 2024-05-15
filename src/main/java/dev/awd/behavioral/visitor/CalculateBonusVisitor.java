package dev.awd.behavioral.visitor;

public class CalculateBonusVisitor implements ScheduleManagementVisitor {
    @Override
    public void visit(DayShiftScheduleManagement dayShiftScheduleManagement) {
        System.out.println("Calculating bonus for Day Shift");
    }

    @Override
    public void visit(NightShiftScheduleManagement nightShiftScheduleManagement) {
        System.out.println("Calculating bonus for Night Shift");

    }

    @Override
    public void visit(RemoteWorkScheduleManagement remoteWorkScheduleManagement) {
        System.out.println("Calculating bonus for Remote Work");

    }
}
