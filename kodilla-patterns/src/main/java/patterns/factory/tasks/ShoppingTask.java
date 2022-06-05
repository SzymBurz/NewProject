package patterns.factory.tasks;

public class ShoppingTask implements Task{
    String taskName;
    String whatToBuy;
    double quantity;
    boolean isExecuted = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public void execute() {
        isExecuted = true;
    }

    @Override
    public void executeTask() {

    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
