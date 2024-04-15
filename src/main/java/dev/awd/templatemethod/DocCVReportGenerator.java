package dev.awd.templatemethod;

import java.io.File;

public class DocCVReportGenerator extends CVReportGenerator {
    @Override
    public Data extractData(File file) {
        System.out.println("Extracting Data From Doc" + file.getAbsolutePath());
        return new Data();
    }
}