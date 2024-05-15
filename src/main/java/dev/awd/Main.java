package dev.awd;

import dev.awd.structural.adapter.excercise.*;

public class Main {
    public static void main(String[] args) {
        ThirdPartyReportingService thirdPartyReportingService = new ThirdPartyReportingService();
        CSVReportingService csvReportingService = new CSVReportingService(thirdPartyReportingService);
        ReportDataAdapter reportDataAdapter = new ReportDataAdaptee(csvReportingService);
        JSONReportData data = reportDataAdapter.generateJsonReport();
        new DashboardService().generateDashboard(data);
    }
}