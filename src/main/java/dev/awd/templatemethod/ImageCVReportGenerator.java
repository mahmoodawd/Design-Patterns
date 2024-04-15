package dev.awd.templatemethod;

import java.io.File;

public class ImageCVReportGenerator extends CVReportGenerator {
    @Override
    public Data extractData(File file) {
        System.out.println("Extracting Data From Image " + file.getAbsolutePath());
        return new Data();
    }
}