package dev.awd.structural.adapter.excercise;

public class ThirdPartyReportingService {
    public CSVReportData generateReport() {
        System.out.println("Third Party Reporting Service is running");
        return new CSVReportData("data");
    }
}
