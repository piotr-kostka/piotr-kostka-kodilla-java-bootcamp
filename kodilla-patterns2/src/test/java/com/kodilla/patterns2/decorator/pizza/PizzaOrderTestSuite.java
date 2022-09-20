package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizza() {
        //Given
        PizzaOrder order = new BasicPizza();
        //When
        BigDecimal cost = order.getCost();
        String description = order.getDescription();
        //Then
        assertEquals(new BigDecimal(15), cost);
        assertEquals("Pizza with tomato sauce and mozzarella", description);
    }

    @Test
    public void testThickDoughPizzaWithGarlicSauce() {
        //Given
        PizzaOrder order = new BasicPizza();
        order = new ThickDoughPizzaDecorator(order);
        order = new GarlicSauceDecorator(order);
        //When
        BigDecimal cost = order.getCost();
        String description = order.getDescription();
        //Then
        assertEquals(new BigDecimal(25), cost);
        assertEquals("Pizza with tomato sauce and mozzarella - thick dough + garlic sauce", description);
    }

    @Test
    public void testClassicDoughPizzaWithAllIngredients() {
        //Given
        PizzaOrder order = new BasicPizza();
        order = new ClassicDoughPizzaDecorator(order);
        order = new ExtraCheeseDecorator(order);
        order = new ExtraHamDecorator(order);
        order = new ExtraMushroomDecorator(order);
        order = new GarlicSauceDecorator(order);
        //When
        BigDecimal cost = order.getCost();
        String description = order.getDescription();
        //Then
        assertEquals(new BigDecimal(33.5), cost);
        assertEquals("Pizza with tomato sauce and mozzarella - classic dough + extra cheese + ham + mushrooms + garlic sauce", description);
    }
}
