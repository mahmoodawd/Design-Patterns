package dev.awd.behavioral.state.excercise;

public class BacklogState implements TaskState {

    private TaskManagement taskManagement;


    public BacklogState(TaskManagement taskManagement) {
        this.taskManagement = taskManagement;
    }

    @Override
    public void placeInBacklog() {
        System.out.println("Task " + taskManagement.getTask().getTitle() + " Already in Backlog");
    }

    @Override
    public void markAsToDo() {
        System.out.println("Task " + taskManagement.getTask().getTitle() + " Marked as To Do");
        taskManagement.setTaskState(new ToDoState(taskManagement));
    }

    @Override
    public void markAsInProgress() {
        System.out.println("Cannot mark " + taskManagement.getTask().getTitle() + " as In Progress at the current state");
    }


    @Override
    public void markAsInReview() {
        System.out.println("Cannot Review " + taskManagement.getTask().getTitle() + " unless it has been done");

    }

    @Override
    public void markAsDone() {
        System.out.println("Cannot mark " + taskManagement.getTask().getTitle() + " as Done unless it has been reviewed");

    }

    @Override
    public void blockTask() {
        System.out.println("Cannot block " + taskManagement.getTask().getTitle() + " as  it is in the backlog");


    }
}
