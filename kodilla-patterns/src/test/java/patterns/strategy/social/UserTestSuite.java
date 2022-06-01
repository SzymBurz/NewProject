package patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSocialMedia() {

        User maciej = new Millenials("Maciej Zajcew");
        User patryk = new ZGeneration("Patryk Konrad");
        User dominik = new YGeneration("Dominik Masłowski");

        String maciejsPost = maciej.sharePost();
        String patryksPost = patryk.sharePost();
        String dominiksPost = dominik.sharePost();

        assertEquals("Na rynku świń dalej tragiczna sytuacja",maciejsPost);
        assertEquals(":D hejo",patryksPost);
        assertEquals("xDxDxD",dominiksPost);
    }

    @Test
    void individualSocialMedia() {

        User maciej = new Millenials("Maciej Zajcew");
        String maciejsPost = maciej.sharePost();
        maciej.setSocialPublisher(new FacebookPublisher());
        maciejsPost = maciej.sharePost();

        assertEquals(":D hejo", maciejsPost);

    }
}
