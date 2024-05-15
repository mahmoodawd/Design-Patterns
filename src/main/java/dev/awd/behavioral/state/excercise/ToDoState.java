package dev.awd.behavioral.state.excercise;

public class ToDoState implements TaskState {

    private TaskManagement taskManagement;


    public ToDoState(TaskManagement taskManagement) {
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
        System.out.println("Task " + taskManagement.getTask().getTitle() + "  marked as In Progress");
        taskManagement.setTaskState(new InProgressState(taskManagement));
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
        System.out.println("Blocking...  " + taskManagement.getTask().getTitle());
        taskManagement.setTaskState(new BlockingState(taskManagement));

    }
}
