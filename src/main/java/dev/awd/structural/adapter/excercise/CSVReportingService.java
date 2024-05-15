package dev.awd.structural.adapter.excercise;

public class CSVReportingService {
    private ThirdPartyReportingService service;

    public CSVReportingService(ThirdPartyReportingService service) {
        this.service = service;
    }

    public CSVReportData generateReport() {
        return service.generateReport();
    }
}
