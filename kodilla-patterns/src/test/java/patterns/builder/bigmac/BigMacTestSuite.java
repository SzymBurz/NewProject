package patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigMacTestSuite {

    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BurgerBuilder()
                .bun("sesame")
                .burgers(2)
                .sauce("barbecue")
                .ingredient("bacon")
                .ingredient("cheese")
                .ingredient("onion")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(3, howManyIngredients);
    }
}

