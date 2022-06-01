package patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void OpenLogger() {
        logger = Logger.INSTANCE;
        logger.log("Burzajew");
    }

    @Test
    public static void TestGetLastLog() {

        String result = logger.getLastLog();
        System.out.println(result);
        assertEquals("Burzajew", result);
    }
}
