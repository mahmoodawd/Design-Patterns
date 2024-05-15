package dev.awd.behavioral.visitor.excercise;

public interface DocumentProcessing {
    void accept(DocProcessingVisitor visitor);
}
