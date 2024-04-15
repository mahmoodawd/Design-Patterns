package dev.awd.visitor.excercise;

public class TextProcessing implements DocumentProcessing {
    @Override
    public void accept(DocProcessingVisitor visitor) {
        visitor.visit(this);
    }
}
