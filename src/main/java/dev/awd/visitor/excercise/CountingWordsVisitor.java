package dev.awd.visitor.excercise;

public class CountingWordsVisitor implements DocProcessingVisitor {
    @Override
    public void visit(DocumentProcessing document) {
        System.out.println("Counting Words of " + document);
    }

}
