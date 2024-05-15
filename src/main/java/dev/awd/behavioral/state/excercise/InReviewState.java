package dev.awd.behavioral.state.excercise;

public class InReviewState implements TaskState {

    private TaskManagement taskManagement;


    public InReviewState(TaskManagement taskManagement) {
        this.taskManagement = taskManagement;
    }

    @Override
    public void placeInBacklog() {
        System.out.println("Task " + taskManagement.getTask().getTitle() + " Already in Backlog");
    }

    @Override
    public void markAsToDo() {
        System.out.println("Task " + taskManagement.getTask().getTitle() + " Already in To Do");

    }

    @Override
    public void markAsInProgress() {
        System.out.println("Cannot mark " + taskManagement.getTask().getTitle() + " as in progress");
    }


    @Override
    public void markAsInReview() {
        System.out.println("Task " + taskManagement.getTask().getTitle() + " has been already reviewed");

    }

    @Override
    public void markAsDone() {
        System.out.println("Task " + taskManagement.getTask().getTitle() + " marked as done");
        taskManagement.setTaskState(new DoneState(taskManagement));

    }

    @Override
    public void blockTask() {
        System.out.println("Cannot block  " + taskManagement.getTask().getTitle() + " at the current state");

    }
}
