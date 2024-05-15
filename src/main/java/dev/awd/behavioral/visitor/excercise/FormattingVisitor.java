package dev.awd.behavioral.visitor.excercise;

public class FormattingVisitor implements DocProcessingVisitor {
    @Override
    public void visit(DocumentProcessing document) {
        System.out.println("Format Document" + document);
    }

}
