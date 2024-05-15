package dev.awd.behavioral.visitor;

public class ManageLeaveRequestVisitor implements ScheduleManagementVisitor {
    @Override
    public void visit(DayShiftScheduleManagement dayShiftScheduleManagement) {
        System.out.println("Manage Day Shift Leaving Requests");

    }

    @Override
    public void visit(NightShiftScheduleManagement nightShiftScheduleManagement) {
        System.out.println("Manage Night Shift Leaving Requests");

    }

    @Override
    public void visit(RemoteWorkScheduleManagement remoteWorkScheduleManagement) {
        System.out.println("Manage Remote Work Leaving Requests");

    }
}
