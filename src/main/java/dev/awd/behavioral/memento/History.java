package dev.awd.behavioral.memento;

import java.util.Stack;

public class History {
    private Stack<TextEditorState> prevState;
    private Stack<TextEditorState> nextState;

    public History() {
        this.prevState = new Stack<>();
        this.nextState = new Stack<>();
    }

    public void saveHistoryState(TextEditorState textEditorState) {
        prevState.push(textEditorState);
        nextState.clear();
    }

    public TextEditorState undo() {
        if (!prevState.isEmpty()) {
            TextEditorState currentState = prevState.pop();
            nextState.push(currentState);
            return currentState;
        }
        return null;
    }

    public TextEditorState redo() {
        if (!nextState.isEmpty()) {
//            TextEditorState currentState = nextState.pop();
//            prevState.push(currentState);
            return nextState.pop();
        }
        return null;
    }


}
