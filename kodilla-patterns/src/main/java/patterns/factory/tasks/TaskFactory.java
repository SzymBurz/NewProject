package patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("zakupsy", "cziperki", 2.3);
            case PAINTINGTASK:
                return new PaintingTask("malowanie", "biały", "Pasy");
            case DRIVINGTASK:
                return new DrivingTask("trasa", "Opole", "auto");
            default:
                return null;
        }
    }
}
