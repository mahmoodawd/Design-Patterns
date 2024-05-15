package dev.awd.behavioral.state.excercise;

public class DoneState implements TaskState {

    private TaskManagement taskManagement;


    public DoneState(TaskManagement taskManagement) {
        this.taskManagement = taskManagement;
    }

    @Override
    public void placeInBacklog() {
        System.out.println("Task " + taskManagement.getTask().getTitle() + " has been Done");
    }

    @Override
    public void markAsToDo() {
        System.out.println("Task " + taskManagement.getTask().getTitle() + " has been Done");
    }

    @Override
    public void markAsInProgress() {
        System.out.println("Task " + taskManagement.getTask().getTitle() + " has been Done");
    }

    @Override
    public void blockTask() {
        System.out.println("Cannot block  " + taskManagement.getTask().getTitle() + " at the current state");
    }

    @Override
    public void markAsInReview() {
        System.out.println("Task " + taskManagement.getTask().getTitle() + " has been Done");
    }

    @Override
    public void markAsDone() {
        System.out.println("Task " + taskManagement.getTask().getTitle() + " has been Done");
    }
}
