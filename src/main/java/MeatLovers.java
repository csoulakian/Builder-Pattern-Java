import java.util.ArrayList;
import java.util.Collections;

/**
 * Chrissy Soulakian
 * BuilderPattern Project
 * Created on 4/20/2016
 *
 * Concrete Builder
 */
public class MeatLovers extends PizzaBuilder {

    public void buildCrust() {
        pizza.setCrust("thick");
    }

    public void buildSauce() {
        pizza.setSauce("mild marinara");
    }

    public void buildToppings() {
        ArrayList<String> toppings = new ArrayList<String>();
        Collections.addAll(toppings, "pepperoni", "sausage", "ham", "bacon", "pork", "beef");
        pizza.setToppings(toppings);
    }

}
