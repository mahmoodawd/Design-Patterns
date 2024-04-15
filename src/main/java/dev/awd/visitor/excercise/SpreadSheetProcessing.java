package dev.awd.visitor.excercise;

public class SpreadSheetProcessing implements DocumentProcessing {
    @Override
    public void accept(DocProcessingVisitor visitor) {
        visitor.visit(this);
    }
}
