package dev.awd;

import dev.awd.state.excercise.Task;
import dev.awd.state.excercise.TaskManagement;

public class Main {
    public static void main(String[] args) {
        TaskManagement taskManagement = new TaskManagement(new Task("Study DS"));


        taskManagement.markAsToDo();
        taskManagement.markAsInProgress();
        taskManagement.markAsInReview();
        taskManagement.markAsDone();
        taskManagement.blockTask();

    }
}