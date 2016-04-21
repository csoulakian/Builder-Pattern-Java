import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;
/**
 * Chrissy Soulakian
 * BuilderPattern Project
 * Created on 4/20/2016
 */
public class BuilderPatternTest {

    Pizza pizza = null;
    Waiter waiter = null;

    @Before
    public void setUp() throws Exception {
        pizza = new Pizza();
        waiter = new Waiter();
    }

    @After
    public void tearDown() throws Exception {
        pizza = null;
        waiter = null;
    }

    @Test
    public void testPizzaBuilder() {
        PizzaBuilder meatLoversPizzaBuilder = new MeatLovers();
        waiter.setPizzaBuilder(meatLoversPizzaBuilder);
        assertEquals(waiter.getPizzaBuilder(), meatLoversPizzaBuilder);
    }

    @Test
    public void testGetPizza() {
        PizzaBuilder meatLoversPizzaBuilder = new MeatLovers();
        waiter.setPizzaBuilder(meatLoversPizzaBuilder);
        waiter.constructPizza();
        Pizza pizza = waiter.getPizza();
        assertEquals(pizza.getCrust(), "thick");
        assertEquals(pizza.getSauce(), "mild marinara");
        ArrayList<String> toppings = new ArrayList<String>();
        Collections.addAll(toppings, "pepperoni", "sausage", "ham", "bacon", "pork", "beef");
        assertEquals(pizza.getToppings(), toppings);
    }

}
