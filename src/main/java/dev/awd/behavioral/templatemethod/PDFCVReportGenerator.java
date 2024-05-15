package dev.awd.behavioral.templatemethod;

import java.io.File;

public class PDFCVReportGenerator extends CVReportGenerator {

    @Override
    public Data extractData(File file) {
        System.out.println("Extracting Data From PDF " + file.getAbsolutePath());
        return new Data();
    }


}
