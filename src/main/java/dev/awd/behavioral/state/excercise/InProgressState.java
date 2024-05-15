package dev.awd.behavioral.state.excercise;

public class InProgressState implements TaskState {

    private TaskManagement taskManagement;


    public InProgressState(TaskManagement taskManagement) {
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
        System.out.println("Task " + taskManagement.getTask().getTitle() + " Already in progress");

    }


    @Override
    public void markAsInReview() {
        System.out.println("Reviewing... " + taskManagement.getTask().getTitle());
        taskManagement.setTaskState(new InReviewState(taskManagement));

    }

    @Override
    public void markAsDone() {
        System.out.println("Cannot mark " + taskManagement.getTask().getTitle() + " as Done unless it has been reviewed");

    }

    @Override
    public void blockTask() {
        System.out.println("Blocking...  " + taskManagement.getTask().getTitle());
        taskManagement.setTaskState(new BlockingState(taskManagement));

    }
}
