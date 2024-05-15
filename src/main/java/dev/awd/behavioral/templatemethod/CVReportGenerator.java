package dev.awd.behavioral.templatemethod;

import java.io.File;
import java.util.Random;

public abstract class CVReportGenerator {

    public GeneratedReport generateReport(String path) {
        File file = readFile(path);
        Data data = extractData(file);
        AnalyzedData analyzeData = analyzeData(data);

        return generateReportOf(analyzeData);
    }

    private File readFile(String path) {
        System.out.println("Reading File From " + path);
        return new File(path);
    }

    protected abstract Data extractData(File file);

    private AnalyzedData analyzeData(Data data) {
        System.out.println("Analyzing Data");
        return new AnalyzedData();
    }

    private GeneratedReport generateReportOf(AnalyzedData analyzeData) {

        System.out.println("Generating Report From " + analyzeData);
        return new GeneratedReport(new Random().nextBoolean());
    }
}
