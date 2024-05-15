package dev.awd.behavioral.visitor;

public interface ScheduleManagementVisitor {
    void visit(DayShiftScheduleManagement dayShiftScheduleManagement);

    void visit(NightShiftScheduleManagement nightShiftScheduleManagement);

    void visit(RemoteWorkScheduleManagement remoteWorkScheduleManagement);
}
