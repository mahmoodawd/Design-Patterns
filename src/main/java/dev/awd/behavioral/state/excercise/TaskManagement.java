package dev.awd.behavioral.state.excercise;

public class TaskManagement {

    private Task task;
    private TaskState taskState;

    public TaskManagement(Task task) {
        this.task = task;
        this.taskState = new BacklogState(this);
    }


    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public TaskState getTaskState() {
        return taskState;
    }

    public void setTaskState(TaskState taskState) {
        this.taskState = taskState;
    }

    public void placeInBacklog() {
        taskState.placeInBacklog();
    }

    public void markAsToDo() {
        taskState.markAsToDo();
    }

    public void markAsInProgress() {
        taskState.markAsInProgress();
    }

    public void blockTask() {
        taskState.blockTask();
    }

    public void markAsInReview() {
        taskState.markAsInReview();
    }

    public void markAsDone() {
        taskState.markAsDone();
    }
}
