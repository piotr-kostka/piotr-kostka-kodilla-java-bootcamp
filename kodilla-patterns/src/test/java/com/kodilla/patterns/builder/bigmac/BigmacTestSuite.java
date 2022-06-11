package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("White bun")
                .ingredient("Pickles")
                .ingredient("Chilli")
                .ingredient("Mushrooms")
                .sauce("Barbecue")
                .burgers(2)
                .ingredient("Salad")
                .ingredient("Onion")
                .ingredient("Bacon")
                .ingredient("Shrimps")
                .ingredient("Cheese")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        //Then
        Assertions.assertEquals(8, howManyIngredients);
        Assertions.assertEquals(2, howManyBurgers);
        Assertions.assertEquals("White bun", bigmac.getBun());
        Assertions.assertEquals("Barbecue", bigmac.getSauce());
    }
}
