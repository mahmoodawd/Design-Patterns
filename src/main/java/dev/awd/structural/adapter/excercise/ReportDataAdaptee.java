package dev.awd.structural.adapter.excercise;

public class ReportDataAdaptee implements ReportDataAdapter {

    CSVReportingService csvReportingService;
    //In case new report appears we just need to introduce it as attribute and  add a conversion method to it here


    public ReportDataAdaptee(CSVReportingService reportingService) {
        this.csvReportingService = reportingService;
    }

    @Override
    public JSONReportData generateJsonReport() {
        return convertCSV2Json(csvReportingService.generateReport());
    }

    JSONReportData convertCSV2Json(CSVReportData csvReportData) {
        System.out.println("Converting " + csvReportData.data + " to JSON");
        return new JSONReportData(csvReportData.data);
    }
}
