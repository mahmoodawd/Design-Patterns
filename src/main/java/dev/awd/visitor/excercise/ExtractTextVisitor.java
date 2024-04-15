package dev.awd.visitor.excercise;

public class ExtractTextVisitor implements DocProcessingVisitor {
    @Override
    public void visit(DocumentProcessing document) {
        System.out.println("Extracting Text of " + document);
    }

}
