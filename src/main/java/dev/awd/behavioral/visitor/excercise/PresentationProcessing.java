package dev.awd.behavioral.visitor.excercise;

public class PresentationProcessing implements DocumentProcessing {
    @Override
    public void accept(DocProcessingVisitor visitor) {
        visitor.visit(this);
    }
}
