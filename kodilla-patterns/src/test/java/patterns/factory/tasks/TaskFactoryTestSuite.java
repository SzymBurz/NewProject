package patterns.factory.tasks;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {


    TaskFactory factory = new TaskFactory();

    @Test
    void testFactoryShoppingTask() {

        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        assertEquals(shoppingTask.getTaskName(), "zakupsy");

    }

    @Test
    void testFactoryPaintingTask() {

        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        assertEquals(paintingTask.getTaskName(), "malowanie");
    }

    @Test
    void testFactoryDrivingTask() {

        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        assertEquals(drivingTask.getTaskName(), "trasa");
    }

}
