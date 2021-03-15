package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.kodilla.patterns.builder.bigmac.Bigmac.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @BeforeAll
    static void intro() {
        System.out.println("\n]]]] Kodilla exercise 15.5 Bigmac [[[[");
    }

    @Test
    void testBigmacNew() {
        // given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .sauce(BARBECUE)
                .ingredient(ONION)
                .burgers(2)
                .ingredient(SHRIMPS)
                .bun(true)
                .ingredient(BACON)
                .ingredient(CHILLI)
                .ingredient(CHEESE)
                .build();
        System.out.println(bigmac);

        // when
        int howManyIngredients = bigmac.getIngredients().size();

        // then
        assertEquals(5, howManyIngredients);
    }
}
