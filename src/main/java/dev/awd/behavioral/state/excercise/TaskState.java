package dev.awd.behavioral.state.excercise;

public interface TaskState {

    void placeInBacklog();

    void markAsToDo();

    void markAsInProgress();

    void blockTask();

    void markAsInReview();

    void markAsDone();
}
