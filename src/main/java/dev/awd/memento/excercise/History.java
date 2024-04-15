package dev.awd.memento.excercise;

import java.util.Stack;

public class History {
    Stack<CanvasState> prevState;
    Stack<CanvasState> nextState;

    public History() {
        this.prevState = new Stack<>();
        this.nextState = new Stack<>();

    }

    public void saveHistoryState(CanvasState state) {
        prevState.push(state);
    }

    public CanvasState undo() {
        if (prevState.isEmpty()) return null;
        return prevState.pop();
    }

    public CanvasState redo() {
        if (nextState.isEmpty()) return null;
        return nextState.pop();
    }
}
